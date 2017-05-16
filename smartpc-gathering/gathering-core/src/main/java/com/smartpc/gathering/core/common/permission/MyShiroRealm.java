package com.smartpc.gathering.core.common.permission;

import com.smartpc.gathering.core.po.user_role_permission.Permission;
import com.smartpc.gathering.core.po.user_role_permission.Role;
import com.smartpc.gathering.core.po.user_role_permission.User;
import com.smartpc.gathering.core.service.UserService;
import org.apache.coyote.http2.ByteUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import sun.security.provider.MD5;

import java.util.*;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: MyShiroRealm
 * @Package com.smartpc.gathering.core.common.permission
 * @Description: 用户权限验证
 * @date 2017/5/14 下午9:37
 */
public class MyShiroRealm extends AuthorizingRealm {
    
    private static final Logger logger = LogManager.getLogger(MyShiroRealm.class);
    
    @Autowired
    UserService userService;

    /**
     * 此方法调用  hasRole,hasPermission的时候才会进行回调.
     *
     * 权限信息.(授权):
     * 1、如果用户正常退出，缓存自动清空；
     * 2、如果用户非正常退出，缓存自动清空；
     * 3、如果我们修改了用户的权限，而用户不退出系统，修改的权限无法立即生效。
     * （需要手动编程进行实现；放在service进行调用）
     * 在权限修改后调用realm中的方法，realm已经由spring管理，所以从spring中获取realm实例，
     * 调用clearCached方法；
     * :Authorization 是授权访问控制，用于对用户进行的操作授权，证明该用户是否允许进行当前操作，如访问某个链接，某个资源文件等。
     * @param principals
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("权限认证方法：MyShiroRealm.doGetAuthenticationInfo()");
        User token = (User) SecurityUtils.getSubject().getPrincipal();
        Long userId = token.getId();
        SimpleAuthorizationInfo authorizationInfo =  new SimpleAuthorizationInfo();
        //根据用户ID查询角色（role），放入到Authorization里。
        List<Role> roleList = userService.findRoleByUserId(userId);
        Set<String> roleSet = new HashSet<String>();
        for(Role role : roleList){
            roleSet.add(role.getRole());
        }
        authorizationInfo.setRoles(roleSet);
        //根据用户ID查询权限（permission），放入到Authorization里。
        List<Permission> permissionList = userService.findPermissionByUserId(userId);
        Set<Long> permissionSet = new HashSet<Long>();
        for(Permission Permission : permissionList){
            permissionSet.add(Permission.getId());
        }
        return authorizationInfo;
    }

    /**
     * 认证信息.(身份验证)
     * 
     * Authentication 是用来验证用户身份
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户的输入的账号、密码
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        //String password = new String(token.getPassword());
        //logger.info(username+"====="+password);
        User user = userService.findByUsername(new User(username));
        logger.info("----->>user="+user);
        if(user == null){
            throw new AuthenticationException("帐号或密码不正确！");
        }else if(user.getState() == 2){
            throw new AuthenticationException("帐号已经禁止登录！");
        }
        //账号判断;加密方式;
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user, //用户名
                user.getPassword(), //密码
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                getName()  //realm name
        );
        return authenticationInfo;
    }

    public static void main(String[] args) {
        int hashIterations = 2;//加密的次数
        Object salt = "dy1";//盐值
        Object credentials = "c4ca4238a0b923820dcc509a6f75849b";//密码
        String hashAlgorithmName = "MD5";//加密方式
        Object simpleHash = new SimpleHash(hashAlgorithmName, credentials,
                salt, hashIterations);
        System.out.println("加密后的值----->" + simpleHash);
    }
}

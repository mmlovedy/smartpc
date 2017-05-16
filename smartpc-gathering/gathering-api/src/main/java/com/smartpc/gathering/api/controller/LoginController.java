package com.smartpc.gathering.api.controller;

import com.smartpc.common.utils.*;
import com.smartpc.common.utils.ResponseStatus;
import com.smartpc.gathering.core.po.user_role_permission.User;
import com.smartpc.gathering.core.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: LoginController
 * @Package com.smartpc.gathering.api.controller
 * @date 2017/5/14 下午2:08
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;
    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String login(){
        return"login";
    }

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value ="/v1/login",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity loginByUsernamePassword(@RequestParam(value = "username") String username,
                                                  @RequestParam(value = "password") String password){
        ResponseEntity responseEntity = new ResponseEntity();
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            token.setRememberMe(true);
            SecurityUtils.getSubject().login(token);
            responseEntity.setResponseStatus(ResponseStatus.RESPONSE_SUCCESS);
        } catch (Exception e) {
            responseEntity.setResponseStatus(ResponseStatus.RESPONSE_FAILED);
            responseEntity.setErroMessage(e.getMessage());
        }
        return responseEntity;
    }

    @RequestMapping(value ="/v1/user/login",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity loginByUser(@RequestBody User user){
        ResponseEntity responseEntity = new ResponseEntity();
        if(user == null){
            responseEntity.setResponseStatus(ResponseStatus.RESPONSE_FAILED);
            responseEntity.setErroMessage("用户不能为空");
        }
        return loginByUsernamePassword( user.getUsername(),user.getPassword());
    }

    @RequestMapping(value="/logout",method =RequestMethod.GET)
    @ResponseBody
    public ResponseEntity logout(){
        ResponseEntity responseEntity = new ResponseEntity();
        try{
            SecurityUtils.getSubject().logout();
         }catch(Exception e){
            responseEntity.setErroMessage(e.getMessage());
            responseEntity.setResponseStatus(ResponseStatus.RESPONSE_FAILED);
            return responseEntity;
         }
        responseEntity.setResponseStatus(ResponseStatus.RESPONSE_SUCCESS);
        return responseEntity;
    }
}

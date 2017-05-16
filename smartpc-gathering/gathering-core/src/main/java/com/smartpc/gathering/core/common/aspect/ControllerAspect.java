package com.smartpc.gathering.core.common.aspect;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: ControllerAspect
 * @Package com.smartpc.common.common
 * @Description: controller 访问日志，//TODO 权限控制
 * @date 2017/5/10 下午3:55
 */
@Aspect
@Component
public class ControllerAspect {

    private static final Logger logger = LogManager.getLogger(ControllerAspect.class);
    ThreadLocal<Long> startTime = new ThreadLocal<Long>();

    @Pointcut("execution(public * com.smartpc..controller..*(..))")
    public void log(){}

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        startTime.set(System.currentTimeMillis());
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("request : " +request.getMethod() + "," + request.getRequestURL().toString());
        logger.info("requestip : " + getIpAddr(request));
        logger.info("request_method : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("args : " + Arrays.toString(joinPoint.getArgs()));
        for(Object o : joinPoint.getArgs()){
            logger.info("args detail"+JSON.toJSONString(o));
        }
    }

    @AfterReturning("log()")
    public void  doAfterReturning(JoinPoint joinPoint){
        // 处理完请求，返回内容
        logger.info("costs: " + (System.currentTimeMillis() - startTime.get()) + "ms");
    }

    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}

package com.smartpc.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: Main
 * @Package com.smartpc.common
 * @date 2017/5/5 下午5:21
 */
@SpringBootApplication
public class CommonMain {
    private static final Logger logger = LogManager.getLogger(CommonMain.class);

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(CommonMain.class, args);
        String[] beanNames =  ctx.getBeanDefinitionNames();
//        String[] beanNames =  ctx.getBeanNamesForAnnotation(Component.class);
        logger.info("beanTotal："+beanNames.length);
        for(String bn:beanNames){
            logger.info(bn);
        }
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer() {
        ClassPathResource resource = new ClassPathResource("config/elasticsearch.properties");
        PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertyPlaceholderConfigurer.setLocation(resource);
        return propertyPlaceholderConfigurer;
    }
}

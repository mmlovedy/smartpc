package com.smartpc.gathering;

import com.smartpc.gathering.core.po.ItemPo;
import com.smartpc.gathering.core.service.ItemsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: Main
 * @Package com.smartpc.gathering.core
 * @date 2017/5/5 下午5:21
 */
@MapperScan("com.smartpc.gathering.core.dao")
@SpringBootApplication
public class GatheringCoreMain {
    
    private static final Logger logger = LogManager.getLogger(GatheringCoreMain.class);
    

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(GatheringCoreMain.class, args);
        String[] beanNames =  ctx.getBeanDefinitionNames();
//        String[] beanNames =  ctx.getBeanNamesForAnnotation(Component.class);
        logger.info("beanTotal："+beanNames.length);
        for(String bn:beanNames){
            logger.info(bn);
        }
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer() {
        ClassPathResource resource = new ClassPathResource("config/config.properties");
        ClassPathResource dbresource = new ClassPathResource("config/db.properties");
        PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertyPlaceholderConfigurer.setLocations(new Resource[]{resource,dbresource});
        return propertyPlaceholderConfigurer;
    }
}

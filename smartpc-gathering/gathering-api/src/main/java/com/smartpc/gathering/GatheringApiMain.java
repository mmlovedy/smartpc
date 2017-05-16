package com.smartpc.gathering;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.smartpc.common.utils.HttpUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: GatheringMain
 * @Package com.smartpc.gathering.main
 * @Description: api 程序入口
 * @date 2017/5/4 下午4:05
 */
@RestController
@SpringBootApplication
public class GatheringApiMain extends SpringBootServletInitializer implements CommandLineRunner{
    private static final Logger logger = LogManager.getLogger(GatheringApiMain.class);


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GatheringApiMain.class);
    }

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //设置实例化 Date 对象的格式
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fastConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(GatheringApiMain.class, args);
        String[] beanNames =  ctx.getBeanDefinitionNames();
//        String[] beanNames =  ctx.getBeanNamesForAnnotation(Component.class);
        logger.info("beanTotal："+beanNames.length+",create beans:");
        for(String bn:beanNames){
            logger.info(bn);
        }
    }

    @RequestMapping("/x")
    public String test(){
        return "hello";
    }

    public void run(String... strings) throws Exception {
        logger.info("启动成功");
    }
}

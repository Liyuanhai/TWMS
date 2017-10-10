package com.gree.twms.app;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * springboot启动类
 *
 */
@ComponentScan(basePackages = {"com.gree.twms.controller","com.gree.twms.service"})
//启动标识
@SpringBootApplication
//mapper 接口扫描
@MapperScan("com.gree.twms.dao")
public class Application extends SpringBootServletInitializer {
    private final static Logger logger = LoggerFactory.getLogger(Application.class);
    /**
     * 程序启动入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        logger.info("Application is success!");
    }
//
//    @Bean
//    public ErrorPageFilter errorPageFilter() {
//        return new ErrorPageFilter();
//    }
//    @Bean
//    public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(filter);
//        filterRegistrationBean.setEnabled(false);
//        return filterRegistrationBean;
//    }

}

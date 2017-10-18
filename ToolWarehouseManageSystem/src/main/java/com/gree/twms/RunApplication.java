package com.gree.twms;

import com.github.pagehelper.PageHelper;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * springboot启动类
 *
 */
@ComponentScan(basePackages = {"com.gree.twms.controller","com.gree.twms.service"})
//启动标识
@SpringBootApplication
@EnableTransactionManagement
//mapper 接口扫描
@MapperScan(basePackages = "com.gree.twms.dao")
public class RunApplication extends SpringBootServletInitializer {
	private final static Logger logger = LoggerFactory.getLogger(RunApplication.class);
	public static void main(String[] args) {
//		TemplateEngine templateEngine = new TemplateEngine();
//		templateEngine.addDialect(new LayoutDialect());
		SpringApplication.run(RunApplication.class,args);
		logger.info("Application is success!");
	}


	//配置mybatis的分页插件pageHelper
	@Bean
	public PageHelper pageHelper(){
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum","true");
		properties.setProperty("rowBoundsWithCount","true");
		properties.setProperty("reasonable","true");
		properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
		pageHelper.setProperties(properties);
		return pageHelper;
	}
}

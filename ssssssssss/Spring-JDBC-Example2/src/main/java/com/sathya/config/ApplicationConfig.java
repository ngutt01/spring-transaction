package com.sathya.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.sathya")
public class ApplicationConfig {
	
	@Bean
	public  JdbcTemplate   jdbcTemplate() {
		return  new  JdbcTemplate(dataSource());
	}
	
	@Bean
	public  DataSource   dataSource() {
		DriverManagerDataSource  dmds=new  DriverManagerDataSource();
		dmds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dmds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dmds.setUsername("system");
		dmds.setPassword("tiger");
		return dmds;

	}
}

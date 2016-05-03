//package com.tomtop.msite;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//@Configuration
//public class GlobalDataSourceConfig {
//	@Bean(name="product") 
//	@Primary
//	@ConfigurationProperties(prefix="datasource.product")
//	public DataSource primaryDataSource() {
//		System.out.println("-----product datasource init-----");
//	    return DataSourceBuilder.create().build();
//	}
//
//	@Bean(name="member")
//	@ConfigurationProperties(prefix="datasource.member")
//	public DataSource secondaryDataSource() {
//		System.out.println("-----member datasource init-----");
//	    return DataSourceBuilder.create().build();
//	}
//}

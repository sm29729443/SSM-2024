package com.atguigu.spring.ioc.config;

import com.atguigu.spring.ioc.datasource.MyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
* ClassName: DataSourceConfig
* Package: com.atguigu.spring.ioc.config
*/
@Configuration
public class DataSourceConfig {

    @Profile("dev")
    @Bean
    public MyDataSource dev() {
        MyDataSource dataSource = new MyDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/dev");
        dataSource.setUsername("dev_user");
        dataSource.setPassword("dev_pwd");
        return dataSource;
    }

    @Profile("test")
    @Bean
    public MyDataSource test() {
        MyDataSource dataSource = new MyDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("test_user");
        dataSource.setPassword("test_pwd");
        return dataSource;
    }

    @Profile("prod")
    @Bean
    public MyDataSource prod() {
        MyDataSource dataSource = new MyDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/prod");
        dataSource.setUsername("prod_user");
        dataSource.setPassword("prod_pwd");
        return dataSource;
    }
}

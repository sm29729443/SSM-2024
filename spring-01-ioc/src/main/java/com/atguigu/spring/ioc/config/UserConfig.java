package com.atguigu.spring.ioc.config;

import com.atguigu.spring.ioc.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* ClassName: UserConfig
* Package: com.atguigu.spring.ioc.config
*/
@Configuration
public class UserConfig {

    @Bean(initMethod = "initUser", destroyMethod = "destroyUser")
    public User user() {
        return new User();
    }

}

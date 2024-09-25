package com.atguigu.spring.ioc.service;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
* ClassName: UserService
* Package: com.atguigu.spring.ioc.service
*/public class UserService implements EnvironmentAware {

    private Environment env;
    @Override
    public void setEnvironment(Environment environment) {
    this.env = environment;
    }
}

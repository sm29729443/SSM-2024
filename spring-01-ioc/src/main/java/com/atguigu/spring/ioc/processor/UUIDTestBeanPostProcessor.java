package com.atguigu.spring.ioc.processor;

import com.atguigu.spring.ioc.annotation.UUID;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
* ClassName: UUIDTestBeanPostProcessor
* Package: com.atguigu.spring.ioc.processor
*/
@Component
public class UUIDTestBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        Field[] fields = beanClass.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            // 判斷 field 是否被 UUID 註解
            if(field.isAnnotationPresent(UUID.class)){
                String uuid = java.util.UUID.randomUUID().toString();
                field.setAccessible(true);
                try {
                    field.set(bean, uuid);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}

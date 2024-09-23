package com.atguigu.spring.ioc.factory;


import com.atguigu.spring.ioc.bean.Car;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class BYDFactory implements FactoryBean<Car> {

    /*
        Spring 會調用此方法給 IOC 容器中註冊組件
     */
    @Override
    public Car getObject() throws Exception {
        System.out.println("BYDFactory getObject Active");
        return new Car();
    }

    /*
        此方法是為了告訴 Spring 這個 Factory 會生成什麼類型
        根據 GPT 的回答是說， Spring 在進行依賴注入時，會調用此方法進行判斷
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    /*
     當 return true 時代表設定成單例的
     如果設定成 false，則每次請求該 Bean 時，都會調用getObject() 返回一個新的物件
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}

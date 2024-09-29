package com.atguigu.spring.ioc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
* ClassName: WindowsCondition
* Package: com.atguigu.spring.ioc.condition
*/
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String os = context.getEnvironment().getProperty("OS");
        if(os != null && os.contains("Windows")){
            return true;
        }
        return false;
    }
}

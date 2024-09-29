package com.atguigu.spring.ioc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
* ClassName: MacCondition
* Package: com.atguigu.spring.ioc.condition
*/public class MacCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String os = context.getEnvironment().getProperty("OS");
        if(os != null && os.contains("mac")){
            return true;
        }
        return false;
    }
}

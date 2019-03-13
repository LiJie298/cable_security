package com.bishe.cable_security.config;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SchedulerCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean isRightENV = context.getEnvironment().getProperty("os.name").toLowerCase().contains("linux");
        boolean isOpen = false;
        return isOpen && isRightENV;
    }
}

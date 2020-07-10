package com.bishe.cable_security.config;


import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Optional;

public class SchedulerCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metaData) {
        boolean isRightEnv = Optional.ofNullable(context.getEnvironment().getProperty("os.name"))
                .filter(m -> !StringUtils.isBlank(m)).get()
                .toLowerCase()
                .contains("linux");
        return isRightEnv;
    }
}

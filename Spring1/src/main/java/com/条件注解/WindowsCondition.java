package com.条件注解;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:43 2018/3/8
 * @Modified By:
 */
public class WindowsCondition implements Condition
{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata)
    {
        String os = conditionContext.getEnvironment().getProperty("os.name");
        System.out.println(os);
        return os.contains("Windows");
    }
}

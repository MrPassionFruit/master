package com.组合注解和元注解;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:05 2018/3/8
 * @Modified By:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//元注解
@Configuration
//元注解
@ComponentScan
public @interface WiselyConfiguration
{
    /**
     * 覆盖参数
     * @return
     */
    String[] value() default {};
}

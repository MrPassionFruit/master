package com.条件注解;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:49 2018/3/8
 * @Modified By:
 */
@Configuration
public class ConditionConfig
{
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windows()
    {
        return new WindowListService();
    }


    /**
     * Conditional(满足条件才执行函数)
     */
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linux()
    {
        return new LinuxListService();
    }
}

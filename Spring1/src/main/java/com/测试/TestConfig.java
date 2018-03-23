package com.测试;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:29 2018/3/8
 * @Modified By:
 */
@Configuration
public class TestConfig
{
    @Bean
    @Profile("dev")
    public TestDemo dev(){
        return new TestDemo("dev");
    }

    @Bean
    @Profile("pro")
    public TestDemo pro(){
        return new TestDemo("pro");
    }
}

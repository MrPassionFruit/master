package com.auto.测试注解配置;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:59 2018/3/13
 * @Modified By:
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties
{
    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}

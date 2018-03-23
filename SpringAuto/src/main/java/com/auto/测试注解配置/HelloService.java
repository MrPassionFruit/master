package com.auto.测试注解配置;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 17:03 2018/3/13
 * @Modified By:
 */
public class HelloService
{
    private String msg;

    @Value("555")
    private String name;

    public String sayHello()
    {
        return "hello" + msg + "," + name;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return "HelloService{" + "msg='" + msg + '\'' + '}';
    }
}

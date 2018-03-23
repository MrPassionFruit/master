package com.auto.注解默认赋值;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:55 2018/3/19
 * @Modified By:
 */
@Component
public class Demo
{

    @Value("45454")
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Demo{" + "name='" + name + '\'' + '}';
    }
}

package com.websocket.domain;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:42 2018/3/20
 * @Modified By:
 */
public class WiselyMessage
{
    private  String name;

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
        return "WiselyMessage{" + "name='" + name + '\'' + '}';
    }
}

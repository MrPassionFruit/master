package com.applicationEvent;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:03 2018/3/7
 * @Modified By:
 */
public class DemoEvent extends ApplicationEvent
{
    private String msg;

    public DemoEvent(Object source, String msg)
    {
        super(source);
        this.msg = msg;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}

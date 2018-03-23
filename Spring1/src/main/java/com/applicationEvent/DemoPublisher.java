package com.applicationEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:11 2018/3/7
 * @Modified By:
 */
@Component
public class DemoPublisher
{
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg)
    {
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}

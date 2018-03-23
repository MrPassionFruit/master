package com.applicationEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring监听事件
 * 1、定义事件,集成ApplicationContext
 * 2、定义事件监听,实现ApplicationListener
 * 3、使用容器发布事件
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:18 2018/3/7
 * @Modified By:
 */
public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello");
        context.close();
    }
}

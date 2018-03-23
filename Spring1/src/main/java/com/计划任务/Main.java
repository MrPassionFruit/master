package com.计划任务;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:17 2018/3/8
 * @Modified By:
 */
public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }

}

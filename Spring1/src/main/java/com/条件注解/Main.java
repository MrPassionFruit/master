package com.条件注解;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:51 2018/3/8
 * @Modified By:
 */
public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService service = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "," + service.showListCmd());
    }
}

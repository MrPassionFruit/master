package com.组合注解和元注解;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:09 2018/3/8
 * @Modified By:
 */
public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoWiselyConfig.class);
        DemoService service = context.getBean(DemoService.class);
        service.outputResult();
        context.close();
    }
}

package com.springAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Aware让bean获取Spring容器的服务
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:54 2018/3/7
 * @Modified By:
 */
public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}

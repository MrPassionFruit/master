package com.applicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:06 2018/3/7
 * @Modified By:
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>
{
    @Override
    public void onApplicationEvent(DemoEvent demoEvent)
    {
        String msg = demoEvent.getMsg();
        System.out.println("DemoListener接收到发布的信息是：" + msg);
    }
}

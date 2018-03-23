package com.计划任务;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:54 2018/3/7
 * @Modified By:
 */
@Service
public class ScheduledTaskService
{
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime()
    {
        System.out.println("每五秒执行一次...."+dateFormat.format(new Date()));
    }

    /**
     * 在每天15点19分执行
     */
    @Scheduled(cron = "0 19 15 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 "+dateFormat.format(new Date()));
    }
}

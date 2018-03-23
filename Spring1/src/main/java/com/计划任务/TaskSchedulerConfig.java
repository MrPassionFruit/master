package com.计划任务;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:17 2018/3/8
 * @Modified By:
 */
@Configuration
@ComponentScan("com.计划任务")
@EnableScheduling
public class TaskSchedulerConfig
{
}

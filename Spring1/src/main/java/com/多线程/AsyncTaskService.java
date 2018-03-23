package com.多线程;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:51 2018/3/7
 * @Modified By:
 */
@Service
public class AsyncTaskService
{
    @Async
    public void executeAsyncTask(Integer i)
    {
        System.out.println("异步执行任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i)
    {
        System.out.println("异步执行任务+1：" + (i + 1));
    }
}

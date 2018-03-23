package com.组合注解和元注解;

import org.springframework.stereotype.Service;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:08 2018/3/8
 * @Modified By:
 */
@Service
public class DemoService
{
    public void outputResult(){
        System.out.println("组合注解");
    }
}

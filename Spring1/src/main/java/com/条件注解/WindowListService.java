package com.条件注解;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:48 2018/3/8
 * @Modified By:
 */
public class WindowListService implements ListService
{
    @Override
    public String showListCmd()
    {
        return "dir";
    }
}

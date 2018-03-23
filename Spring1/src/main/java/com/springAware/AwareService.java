package com.springAware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:48 2018/3/7
 * @Modified By:
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware
{
    private String beanName;
    private ResourceLoader loader;


    @Override
    public void setBeanName(String s)
    {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader)
    {
        this.loader = resourceLoader;
    }

    public void outputResult()
    {
        System.out.println("Bean Name is :" + beanName);
        Resource resource = loader.getResource("classpath:awareTest.txt");
        try
        {
            System.out.println(IOUtils.toString(resource.getInputStream()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

package com.spring.angular.controller;

import com.spring.angular.po.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 14:38 2018/3/21
 * @Modified By:
 */
@RestController
public class PersonController
{
    @RequestMapping(value = "/search",produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person search(String personName){
        return new Person(personName,"20","test");
    }
}

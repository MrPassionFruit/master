package com.websocket.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 14:42 2018/3/20
 * @Modified By:
 */
public class MyPasswordEncoder implements PasswordEncoder
{
    @Override
    public String encode(CharSequence charSequence)
    {
        System.out.println("encode:"+charSequence.toString());
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence arg0, String arg1)
    {
        System.out.println("matches:"+arg0.toString()+"...."+arg1);
        return arg1.equals(arg0.toString());
    }
}

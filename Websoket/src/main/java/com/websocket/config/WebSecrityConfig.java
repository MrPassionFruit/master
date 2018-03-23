package com.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 12:00 2018/3/20
 * @Modified By:
 */
@Configuration
@EnableWebSecurity
public class WebSecrityConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
            //设置/和/login路径不拦截
            .antMatchers("/", "/login").permitAll().anyRequest().authenticated().and().formLogin()
            //登录界面
            .loginPage("/login")
            //登录成功界面
            .defaultSuccessUrl("/chat").permitAll().and().logout().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        //配置2个用户
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).withUser("test").password("123456").roles("USER").and().withUser("test1")
            .password("123456").roles("USER");
    }

    @Override
    public void configure(WebSecurity web) throws Exception
    {
        //静态资源
        web.ignoring().antMatchers("/resources/static/**");
    }
}

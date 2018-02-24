package wxf.hq.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 11:29 2018/2/2
 * @Modified By:
 */
@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(MainApplication.class);
    }

    public static void main(String[] args)
    {
        SpringApplication.run(MainApplication.class,args);
    }
}

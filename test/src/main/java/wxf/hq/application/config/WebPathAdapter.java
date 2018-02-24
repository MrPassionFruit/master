package wxf.hq.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 11:43 2017/8/17
 * @Modified By:
 */
@Configuration
public class WebPathAdapter extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

}

package com.auto;

import com.auto.注解默认赋值.Demo;
import com.auto.测试注解配置.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@SpringBootApplication
public class SpringautoApplication {

	@Autowired
	private Demo demo;

	@Autowired
	HelloService helloService;

	@RequestMapping("/")
	public String index(){
		System.out.println(demo);
		String result = helloService.sayHello();
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringautoApplication.class, args);
	}

	/**
	 * 自定义服务器
	 */
	@Component
	public static class CustomerTomcat implements EmbeddedServletContainerCustomizer
	{

		@Override
		public void customize(ConfigurableEmbeddedServletContainer container)
		{
			container.setPort(8888);
			container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
			container.setSessionTimeout(10, TimeUnit.MINUTES);
		}
	}
}

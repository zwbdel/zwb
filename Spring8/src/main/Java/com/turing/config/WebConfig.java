package com.turing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * SpringMVC的配置项
 * @author fred
 *
 */

@Configuration //标识一个配置项
@ComponentScan(basePackages = {"com.turing.controller"}) //扫描指定的包中，打了四种组件注解的
@EnableWebMvc //开启SpringMVC注解
public class WebConfig extends WebMvcConfigurerAdapter{

	//配置视图解析器
	@Bean
	public ViewResolver viewResolver() {
		//创建视图解析器，并设置前缀和后缀
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/WEB-INF/jsp/",".jsp");
        //设置bean在请求属性中也可以访问
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	//开启静态资源的访问
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		//开启
		configurer.enable();
	}
}

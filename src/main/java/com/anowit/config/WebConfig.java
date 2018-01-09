package com.anowit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author moesio @ gmail.com
 * @date May 24, 2016 8:54:15 PM
 */
@Configuration
@ComponentScan(basePackages = { //
		"com.anowit.validator", //
		"com.anowit.dao", //
		"com.anowit.service", //
		"com.anowit.controller", //
})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	//	@Autowired
	//	private Converter<String[], List<Privilege>> myConverter;
	//
	//	@Override
	//	public void addFormatters(FormatterRegistry registry) {
	//		registry.addConverter(myConverter);
	//	}

}

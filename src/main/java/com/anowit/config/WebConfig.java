package com.anowit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.anowit.converter.LocalDateConverter;

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
		"com.anowit.converter", //
})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private LocalDateConverter localDateConverter;

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(localDateConverter);
	}

}

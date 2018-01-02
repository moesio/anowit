package com.anowit.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.anowit.domain.Privilege;

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

	@Autowired
	private Converter<String[], List<Privilege>> myConverter;

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(myConverter);
	}

}

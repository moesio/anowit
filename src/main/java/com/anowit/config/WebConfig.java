package com.anowit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
public class WebConfig {

}

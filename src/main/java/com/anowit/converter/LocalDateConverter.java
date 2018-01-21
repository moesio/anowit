package com.anowit.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.seimos.commons.web.config.ConfigKey;
import com.seimos.commons.web.config.ConfigReader;

/**
 * @author moesio
 * @date 2018-01-14 08:17:38
 *
 */
@Component
public class LocalDateConverter implements Converter<String, LocalDate> {

	@Override
	public LocalDate convert(String source) {
		if (!StringUtils.isEmpty(source)) {
			DateTimeFormatter formatter = new DateTimeFormatterBuilder()
					.appendPattern(ConfigReader.get(ConfigKey.dateFormat.toString())).toFormatter();
			return LocalDate.parse(source, formatter);
		}
		return null;
	}

}

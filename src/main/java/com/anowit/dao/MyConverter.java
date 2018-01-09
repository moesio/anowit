package com.anowit.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;

import com.anowit.domain.Privilege;;

/**
 * @author moesio.medeiros
 * @date 1 de jan de 2018 21:14:23
 *
 */
//@Component
public class MyConverter implements Converter<String[], List<Privilege>> {

	@Override
	public List<Privilege> convert(String[] source) {
		ArrayList<Privilege> list = new ArrayList<Privilege>();
		for (String id : source) {
			list.add(new Privilege().setId(Integer.valueOf(id)));
		}
		return list;
	}

}

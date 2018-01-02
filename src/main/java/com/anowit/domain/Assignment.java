package com.anowit.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 10:18:51 
 *
 */
@Embeddable
public class Assignment {

	private String source;
	@ManyToOne
	private Person handler;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Person getHandler() {
		return handler;
	}

	public void setHandler(Person handler) {
		this.handler = handler;
	}

}
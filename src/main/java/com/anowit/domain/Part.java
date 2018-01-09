package com.anowit.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * @author moesio
 * @date 2018-01-04 21:58:13
 *
 */
@Embeddable
public class Part {
	protected String material;

	@ManyToOne
	protected Person handler;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Person getHandler() {
		return handler;
	}

	public void setHandler(Person handler) {
		this.handler = handler;
	}

}

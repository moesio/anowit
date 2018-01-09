package com.anowit.domain;

import javax.persistence.Embeddable;

/**
 * @author moesio
 * @date 2018-01-04 23:08:46
 *
 */
@Embeddable
public class PublicTalk extends Part {
	private String congregation;

	public String getCongregation() {
		return congregation;
	}

	public void setCongregation(String congregation) {
		this.congregation = congregation;
	}

}

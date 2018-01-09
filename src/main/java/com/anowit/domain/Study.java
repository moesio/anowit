/**
 * 
 */
package com.anowit.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * @author moesio
 * @date 2018-01-04 23:02:59
 *
 */
@Embeddable
public class Study extends Part {
	@ManyToOne
	private Person reader;

	public Person getReader() {
		return reader;
	}

	public void setReader(Person reader) {
		this.reader = reader;
	}
}

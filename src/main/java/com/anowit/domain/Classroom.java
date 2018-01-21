package com.anowit.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 09:49:11
 *
 */
@Embeddable
public class Classroom {

	@Embedded
	private Assignment bibleReading;

	@Embedded
	private Presentation first;

	@Embedded
	private Presentation second;

	@Embedded
	private Presentation third;

	public Assignment getBibleReading() {
		return bibleReading;
	}

	public void setBibleReading(Assignment bibleReading) {
		this.bibleReading = bibleReading;
	}

	public Presentation getFirst() {
		return first;
	}

	public void setFirst(Presentation first) {
		this.first = first;
	}

	public Presentation getSecond() {
		return second;
	}

	public void setSecond(Presentation second) {
		this.second = second;
	}

	public Presentation getThird() {
		return third;
	}

	public void setThird(Presentation third) {
		this.third = third;
	}

}

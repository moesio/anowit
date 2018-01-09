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
	private Assignment bibleReadingAssignment;
	@Embedded
	private Assignment firstAssignment;
	@Embedded
	private Assignment secondAssignment;
	@Embedded
	private Assignment thirdAssignment;

	public Assignment getBibleReadingAssignment() {
		return bibleReadingAssignment;
	}

	public void setBibleReadingAssignment(Assignment bibleReadingAssignment) {
		this.bibleReadingAssignment = bibleReadingAssignment;
	}

	public Assignment getFirstAssignment() {
		return firstAssignment;
	}

	public void setFirstAssignment(Assignment firstAssignment) {
		this.firstAssignment = firstAssignment;
	}

	public Assignment getSecondAssignment() {
		return secondAssignment;
	}

	public void setSecondAssignment(Assignment secondAssignment) {
		this.secondAssignment = secondAssignment;
	}

	public Assignment getThirdAssignment() {
		return thirdAssignment;
	}

	public void setThirdAssignment(Assignment thirdAssignment) {
		this.thirdAssignment = thirdAssignment;
	}

}

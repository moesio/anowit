package com.anowit.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 10:18:51
 *
 */
@Embeddable
public class Assignment extends Part {
	@ManyToOne
	private Person assistant;

	@ManyToOne
	private CounselPoint counselPoint;

	public Person getAssistant() {
		return assistant;
	}

	public void setAssistant(Person assistant) {
		this.assistant = assistant;
	}

	public CounselPoint getCounselPoint() {
		return counselPoint;
	}

	public void setCounselPoint(CounselPoint counselPoint) {
		this.counselPoint = counselPoint;
	}

}
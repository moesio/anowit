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

	@ManyToOne
	private AssignmentKind kind;
	private String source;
	@ManyToOne
	private Person handler;
	@ManyToOne
	private Person assistant;
	@ManyToOne
	private CounselPoint counselPoint;

	public AssignmentKind getKind() {
		return kind;
	}

	public void setKind(AssignmentKind kind) {
		this.kind = kind;
	}

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
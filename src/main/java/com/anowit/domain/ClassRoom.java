package com.anowit.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 09:49:11 
 *
 */
@Entity
@Table
public class ClassRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@ManyToOne
	private Person counselor;
	@Embedded
	//	@AttributeOverrides({ //
	//			@AttributeOverride(name = "kind", column = @Column(name = "bibleReadingAssignmentKind")),
	//			@AttributeOverride(name = "source", column = @Column(name = "bibleReadingAssignmentSource")), //
	//			@AttributeOverride(name = "handler", column = @Column(name = "bibleReadingAssignmentHandler")), //
	//			@AttributeOverride(name = "assistant", column = @Column(name = "bibleReadingAssignmentAssistant")), //
	//			@AttributeOverride(name = "counselPoint", column = @Column(name = "bibleReadingAssignmentCounselPoint")),//
	//	})
	private Assignment bibleReadingAssignment;
	//	@Embedded
	//	@AttributeOverrides({ //
	//			@AttributeOverride(name = "kind", column = @Column(name = "firstAssignmentKind")),
	//			@AttributeOverride(name = "source", column = @Column(name = "firstAssignmentSource")), //
	//			@AttributeOverride(name = "handler", column = @Column(name = "firstAssignmentHandler")), //
	//			@AttributeOverride(name = "assistant", column = @Column(name = "firstAssignmentAssistant")), //
	//			@AttributeOverride(name = "counselPoint", column = @Column(name = "firstAssignmentCounselPoint")),//
	//	})
	//	private Assignment firstAssignment;
	//	@Embedded
	//	@AttributeOverrides({ //
	//			@AttributeOverride(name = "kind", column = @Column(name = "secondAssignmentKind")),
	//			@AttributeOverride(name = "source", column = @Column(name = "secondAssignmentSource")), //
	//			@AttributeOverride(name = "handler", column = @Column(name = "secondAssignmentHandler")), //
	//			@AttributeOverride(name = "assistant", column = @Column(name = "secondAssignmentAssistant")), //
	//			@AttributeOverride(name = "counselPoint", column = @Column(name = "secondAssignmentCounselPoint")),//
	//	})
	//	private Assignment secondAssignment;
	//	@Embedded
	//	@AttributeOverrides({ //
	//			@AttributeOverride(name = "kind", column = @Column(name = "thirdAssignmentKind")),
	//			@AttributeOverride(name = "source", column = @Column(name = "thirdAssignmentSource")), //
	//			@AttributeOverride(name = "handler", column = @Column(name = "thirdAssignmentHandler")), //
	//			@AttributeOverride(name = "assistant", column = @Column(name = "thirdAssignmentAssistant")), //
	//			@AttributeOverride(name = "counselPoint", column = @Column(name = "thirdAssignmentCounselPoint")),//
	//	})
	//	private Assignment thirdAssignment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getCounselor() {
		return counselor;
	}

	public void setCounselor(Person counselor) {
		this.counselor = counselor;
	}

	public Assignment getBibleReadingAssignment() {
		return bibleReadingAssignment;
	}

	public void setBibleReadingAssignment(Assignment bibleReadingAssignment) {
		this.bibleReadingAssignment = bibleReadingAssignment;
	}

	//	public Assignment getFirstAssignment() {
	//		return firstAssignment;
	//	}
	//
	//	public void setFirstAssignment(Assignment firstAssignment) {
	//		this.firstAssignment = firstAssignment;
	//	}
	//
	//	public Assignment getSecondAssignment() {
	//		return secondAssignment;
	//	}
	//
	//	public void setSecondAssignment(Assignment secondAssignment) {
	//		this.secondAssignment = secondAssignment;
	//	}
	//
	//	public Assignment getThirdAssignment() {
	//		return thirdAssignment;
	//	}
	//
	//	public void setThirdAssignment(Assignment thirdAssignment) {
	//		this.thirdAssignment = thirdAssignment;
	//	}
}

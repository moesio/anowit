package com.anowit.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author moesio.medeiros
 * @date 31 de dez de 2017 16:38:00 
 *
 */
//@Table
//@Entity
public class Week {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 100)
	private String period;
	@ManyToOne
	private Group group;
	private MidweekMeeting midweekMeeting;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public MidweekMeeting getMidweekMeeting() {
		return midweekMeeting;
	}

	public void setMidweekMeeting(MidweekMeeting midweekMeeting) {
		this.midweekMeeting = midweekMeeting;
	}

}

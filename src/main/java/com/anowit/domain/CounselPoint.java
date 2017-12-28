package com.anowit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 10:08:04 
 *
 */
@Entity
@Table(name = "counsel_point")
public class CounselPoint {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private Integer study;

	@Column(nullable = false)
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudy() {
		return study;
	}

	public void setStudy(Integer study) {
		this.study = study;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

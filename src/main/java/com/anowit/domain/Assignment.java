package com.anowit.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 10:18:51
 *
 */
@Embeddable
@MappedSuperclass
public class Assignment extends Part {

	@ManyToOne
	private CounselPoint counselPoint;

	public CounselPoint getCounselPoint() {
		return counselPoint;
	}

	public void setCounselPoint(CounselPoint counselPoint) {
		this.counselPoint = counselPoint;
	}

}
package com.anowit.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * @author moesio
 * @date 2018-01-11 19:13:17
 *
 */
@Embeddable
@MappedSuperclass
public class Presentation extends Assignment {
	private Boolean video;

	@ManyToOne
	private Person assistant;

	public Boolean getVideo() {
		return video;
	}

	public void setVideo(Boolean video) {
		this.video = video;
	}

	public Person getAssistant() {
		return assistant;
	}

	public void setAssistant(Person assistant) {
		this.assistant = assistant;
	}

}

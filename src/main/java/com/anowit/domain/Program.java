package com.anowit.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 09:22:11 
 *
 */
@Entity
@Table
public class Program {
	@Id
	@GeneratedValue
	private Integer id;
	private String period;
	@ManyToOne
	private Group group;
	@OneToMany
	private List<Privilege> privileges;

	//	private Calendar midweekDate;
	//	@ManyToOne
	//	private Group group;
	//	@OneToMany
	//	private List<ClassRoom> classRooms;
	//	@Embedded
	//	private Assignment treasureTalk;
	//	@Embedded
	//	private Assignment gems;
	//	@Embedded
	//	private Assignment livingFirstTalk;
	//	@Embedded
	//	private Assignment livingSecondTalk;
	//	@Embedded
	//	private Assignment congregationBibleStudy;
	//	private Calendar weekendDate;
	//	@ManyToOne
	//	private Person chairman;
	//	private String publicConferenceTheme;
	//	private String publicConferenceHandler;
	//	private String publicConferenceHandlerCongregation;
	//	private String watchtowerTheme;
	//	@ManyToOne
	//	private Person watchtowerHandler;
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

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	//	public Integer getId() {
	//		return id;
	//	}
	//
	//	public void setId(Integer id) {
	//		this.id = id;
	//	}
	//
	//	public Calendar getMidweekDate() {
	//		return midweekDate;
	//	}
	//
	//	public void setMidweekDate(Calendar midweekDate) {
	//		this.midweekDate = midweekDate;
	//	}
	//
	//	public Group getGroup() {
	//		return group;
	//	}
	//
	//	public void setGroup(Group group) {
	//		this.group = group;
	//	}
	//
	//	public List<Privilege> getPrivileges() {
	//		return privileges;
	//	}
	//
	//	public void setPrivileges(List<Privilege> privileges) {
	//		this.privileges = privileges;
	//	}
	//
	//	public List<ClassRoom> getClassRooms() {
	//		return classRooms;
	//	}
	//
	//	public void setClassRooms(List<ClassRoom> classRooms) {
	//		this.classRooms = classRooms;
	//	}
	//
	//	public Assignment getTreasureTalk() {
	//		return treasureTalk;
	//	}
	//
	//	public void setTreasureTalk(Assignment treasureTalk) {
	//		this.treasureTalk = treasureTalk;
	//	}
	//
	//	public Assignment getGems() {
	//		return gems;
	//	}
	//
	//	public void setGems(Assignment gems) {
	//		this.gems = gems;
	//	}
	//
	//	public Assignment getLivingFirstTalk() {
	//		return livingFirstTalk;
	//	}
	//
	//	public void setLivingFirstTalk(Assignment livingFirstTalk) {
	//		this.livingFirstTalk = livingFirstTalk;
	//	}
	//
	//	public Assignment getLivingSecondTalk() {
	//		return livingSecondTalk;
	//	}
	//
	//	public void setLivingSecondTalk(Assignment livingSecondTalk) {
	//		this.livingSecondTalk = livingSecondTalk;
	//	}
	//
	//	public Assignment getCongregationBibleStudy() {
	//		return congregationBibleStudy;
	//	}
	//
	//	public void setCongregationBibleStudy(Assignment congregationBibleStudy) {
	//		this.congregationBibleStudy = congregationBibleStudy;
	//	}
	//
	//	public Calendar getWeekendDate() {
	//		return weekendDate;
	//	}
	//
	//	public void setWeekendDate(Calendar weekendDate) {
	//		this.weekendDate = weekendDate;
	//	}
	//
	//	public Person getChairman() {
	//		return chairman;
	//	}
	//
	//	public void setChairman(Person chairman) {
	//		this.chairman = chairman;
	//	}
	//
	//	public String getPublicConferenceTheme() {
	//		return publicConferenceTheme;
	//	}
	//
	//	public void setPublicConferenceTheme(String publicConferenceTheme) {
	//		this.publicConferenceTheme = publicConferenceTheme;
	//	}
	//
	//	public String getPublicConferenceHandler() {
	//		return publicConferenceHandler;
	//	}
	//
	//	public void setPublicConferenceHandler(String publicConferenceHandler) {
	//		this.publicConferenceHandler = publicConferenceHandler;
	//	}
	//
	//	public String getPublicConferenceHandlerCongregation() {
	//		return publicConferenceHandlerCongregation;
	//	}
	//
	//	public void setPublicConferenceHandlerCongregation(String publicConferenceHandlerCongregation) {
	//		this.publicConferenceHandlerCongregation = publicConferenceHandlerCongregation;
	//	}
	//
	//	public String getWatchtowerTheme() {
	//		return watchtowerTheme;
	//	}
	//
	//	public void setWatchtowerTheme(String watchtowerTheme) {
	//		this.watchtowerTheme = watchtowerTheme;
	//	}
	//
	//	public Person getWatchtowerHandler() {
	//		return watchtowerHandler;
	//	}
	//
	//	public void setWatchtowerHandler(Person watchtowerHandler) {
	//		this.watchtowerHandler = watchtowerHandler;
	//	}

}

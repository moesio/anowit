package com.anowit.domain;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 09:22:11
 *
 */
@Entity
@Table
public class Schedule {
	@Id
	@GeneratedValue
	private Integer id;

	private LocalDate midweekDate;

	@ManyToOne
	private Person midweekChairman;

	@ManyToOne
	private Person auxiliaryConselor;

	@ManyToOne
	private Song midweekInitialSong;

	@ManyToOne
	private Person initialPrayer;

	@Embedded
	private Part treasureTalk;

	@Embedded
	private Part gems;

	@Embedded
	private Classroom mainHall;

	@Embedded
	private Classroom auxiliaryClass;

	@ManyToOne
	private Song midweekMiddleSong;

	@Embedded
	private Part livingFirstPart;

	@Embedded
	private Part livingSecondPart;

	@Embedded
	private Study congregationBibleStudy;

	@ManyToOne
	private Song midweekFinalSong;

	private LocalDate weekendDate;

	@ManyToOne
	private Person weekendChairman;

	@ManyToOne
	private Song weekendnitialSong;

	@Embedded
	private PublicTalk publicTalk;

	@Embedded
	private Study watchtowerStudy;

	@ManyToOne
	private Song weekendFinalSong;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getMidweekDate() {
		return midweekDate;
	}

	public void setMidweekDate(LocalDate midweekDate) {
		this.midweekDate = midweekDate;
	}

	public Person getMidweekChairman() {
		return midweekChairman;
	}

	public void setMidweekChairman(Person midweekChairman) {
		this.midweekChairman = midweekChairman;
	}

	public Person getAuxiliaryConselor() {
		return auxiliaryConselor;
	}

	public void setAuxiliaryConselor(Person auxiliaryConselor) {
		this.auxiliaryConselor = auxiliaryConselor;
	}

	public Song getMidweekInitialSong() {
		return midweekInitialSong;
	}

	public void setMidweekInitialSong(Song midweekInitialSong) {
		this.midweekInitialSong = midweekInitialSong;
	}

	public Person getInitialPrayer() {
		return initialPrayer;
	}

	public void setInitialPrayer(Person initialPrayer) {
		this.initialPrayer = initialPrayer;
	}

	public Part getTreasureTalk() {
		return treasureTalk;
	}

	public void setTreasureTalk(Part treasureTalk) {
		this.treasureTalk = treasureTalk;
	}

	public Part getGems() {
		return gems;
	}

	public void setGems(Part gems) {
		this.gems = gems;
	}

	public Classroom getMainHall() {
		return mainHall;
	}

	public void setMainHall(Classroom mainHall) {
		this.mainHall = mainHall;
	}

	public Classroom getAuxiliaryClass() {
		return auxiliaryClass;
	}

	public void setAuxiliaryClass(Classroom auxiliaryClass) {
		this.auxiliaryClass = auxiliaryClass;
	}

	public Song getMidweekMiddleSong() {
		return midweekMiddleSong;
	}

	public void setMidweekMiddleSong(Song midweekMiddleSong) {
		this.midweekMiddleSong = midweekMiddleSong;
	}

	public Part getLivingFirstPart() {
		return livingFirstPart;
	}

	public void setLivingFirstPart(Part livingFirstPart) {
		this.livingFirstPart = livingFirstPart;
	}

	public Part getLivingSecondPart() {
		return livingSecondPart;
	}

	public void setLivingSecondPart(Part livingSecondPart) {
		this.livingSecondPart = livingSecondPart;
	}

	public Study getCongregationBibleStudy() {
		return congregationBibleStudy;
	}

	public void setCongregationBibleStudy(Study congregationBibleStudy) {
		this.congregationBibleStudy = congregationBibleStudy;
	}

	public Song getMidweekFinalSong() {
		return midweekFinalSong;
	}

	public void setMidweekFinalSong(Song midweekFinalSong) {
		this.midweekFinalSong = midweekFinalSong;
	}

	public LocalDate getWeekendDate() {
		return weekendDate;
	}

	public void setWeekendDate(LocalDate weekendDate) {
		this.weekendDate = weekendDate;
	}

	public Person getWeekendChairman() {
		return weekendChairman;
	}

	public void setWeekendChairman(Person weekendChairman) {
		this.weekendChairman = weekendChairman;
	}

	public Song getWeekendnitialSong() {
		return weekendnitialSong;
	}

	public void setWeekendnitialSong(Song weekendnitialSong) {
		this.weekendnitialSong = weekendnitialSong;
	}

	public PublicTalk getPublicTalk() {
		return publicTalk;
	}

	public void setPublicTalk(PublicTalk publicTalk) {
		this.publicTalk = publicTalk;
	}

	public Study getWatchtowerStudy() {
		return watchtowerStudy;
	}

	public void setWatchtowerStudy(Study watchtowerStudy) {
		this.watchtowerStudy = watchtowerStudy;
	}

	public Song getWeekendFinalSong() {
		return weekendFinalSong;
	}

	public void setWeekendFinalSong(Song weekendFinalSong) {
		this.weekendFinalSong = weekendFinalSong;
	}

}

package com.project.MentorOnDemand.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorskills")
public class Mentorskills {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "mid")
	private Long mid;
	
	@Column(name = "sid")
	private Long sid;
	
	@Column(name = "selfrating")
	private String selfrating;
	
	@Column(name = "experience")
	private int experience;
	
	@Column(name = "trainingsdelivered")
	private String trainingsdelivered;
	
	@Column(name = "facilitiesoffered")
	private String facilitiesoffered;

	public Mentorskills() {

	}

	public Mentorskills(Long mid, Long sid, String selfrating, int experience, String trainingsdelivered,
			String facilitiesoffered) {
		
		this.mid = mid;
		this.sid = sid;
		this.selfrating = selfrating;
		this.experience = experience;
		this.trainingsdelivered = trainingsdelivered;
		this.facilitiesoffered = facilitiesoffered;
	}

	public long getId() {
		return id;
	}


	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getSelfrating() {
		return selfrating;
	}

	public void setSelfrating(String selfrating) {
		this.selfrating = selfrating;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getTrainingsdelivered() {
		return trainingsdelivered;
	}

	public void setTrainingsdelivered(String trainingsdelivered) {
		this.trainingsdelivered = trainingsdelivered;
	}

	public String getFacilitiesoffered() {
		return facilitiesoffered;
	}

	public void setFacilitiesoffered(String facilitiesoffered) {
		this.facilitiesoffered = facilitiesoffered;
	}

	@Override
	public String toString() {
		return "Mentorskills [id=" + id + ", mid=" + mid + ", sid=" + sid + ", selfrating=" + selfrating
				+ ", experience=" + experience + ", trainingsdelivered=" + trainingsdelivered + ", facilitiesoffered="
				+ facilitiesoffered + "]";
	}
	
	
	
}

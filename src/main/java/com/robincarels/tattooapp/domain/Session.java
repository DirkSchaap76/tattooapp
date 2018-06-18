package com.robincarels.tattooapp.domain;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	LocalDate sessionDate;
	LocalTime sessionTime;
	
	boolean sessionConfirmed;
	boolean sessionDeclined;
	public LocalDate getSessionDate() {
		return sessionDate;
	}
	public void setSessionDate(LocalDate sessionDate) {
		this.sessionDate = sessionDate;
	}
	public LocalTime getSessionTime() {
		return sessionTime;
	}
	public void setSessionTime(LocalTime sessionTime) {
		this.sessionTime = sessionTime;
	}
	public boolean isSessionConfirmed() {
		return sessionConfirmed;
	}
	public void setSessionConfirmed(boolean sessionConfirmed) {
		this.sessionConfirmed = sessionConfirmed;
	}
	public boolean isSessionDeclined() {
		return sessionDeclined;
	}
	public void setSessionDeclined(boolean sessionDeclined) {
		this.sessionDeclined = sessionDeclined;
	}
}

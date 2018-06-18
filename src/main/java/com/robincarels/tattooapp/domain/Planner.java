package com.robincarels.tattooapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Planner {

	
	@Id
	@GeneratedValue
	private long id;
	private String depositRequest;
	private double deposit;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

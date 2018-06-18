package com.robincarels.tattooapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TattooArtist {
public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCostumer() {
		return costumer;
	}
	public void setCostumer(String costumer) {
		this.costumer = costumer;
	}
@Id
@GeneratedValue
private long id;
private String costumer;
}

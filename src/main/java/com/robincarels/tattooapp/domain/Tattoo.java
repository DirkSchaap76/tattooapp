package com.robincarels.tattooapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Tattoo {
@Id
@GeneratedValue

private int tattooId;
private boolean tattooInColor;

private double tattooWidth;
public int getTattooId() {
	return tattooId;
}
public void setTattooId(int tattooId) {
	this.tattooId = tattooId;
}
public boolean isTattooInColor() {
	return tattooInColor;
}
public void setTattooInColor(boolean tattooInColor) {
	this.tattooInColor = tattooInColor;
}
public double getTattooWidth() {
	return tattooWidth;
}
public void setTattooWidth(double tattooWidth) {
	this.tattooWidth = tattooWidth;
}
public double getTattooHeight() {
	return tattooHeight;
}
public void setTattooHeight(double tattooHeight) {
	this.tattooHeight = tattooHeight;
}
public String getTattooPlace() {
	return tattooPlace;
}
public void setTattooPlace(String tattooPlace) {
	this.tattooPlace = tattooPlace;
}
public boolean isTattooFinished() {
	return tattooFinished;
}
public void setTattooFinished(boolean tattooFinished) {
	this.tattooFinished = tattooFinished;
}
private double tattooHeight;

private String tattooPlace;
private boolean tattooFinished;


}

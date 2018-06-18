package com.robincarels.tattooapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	private String customerName;
	private int customerAge;
	private String costumerEmailAdress;
	private int costumerPhoneNumber;
	private String costumerTattooDescription;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCostumerEmailAdress() {
		return costumerEmailAdress;
	}
	public void setCostumerEmailAdress(String costumerEmailAdress) {
		this.costumerEmailAdress = costumerEmailAdress;
	}
	public int getCostumerPhoneNumber() {
		return costumerPhoneNumber;
	}
	public void setCostumerPhoneNumber(int costumerPhoneNumber) {
		this.costumerPhoneNumber = costumerPhoneNumber;
	}
	public String getCostumerTattooDescription() {
		return costumerTattooDescription;
	}
	public void setCostumerTattooDescription(String costumerTattooDescription) {
		this.costumerTattooDescription = costumerTattooDescription;
	}
}

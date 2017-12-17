package com.ps.controller.dto;

public class Name {
	private String firstName;
	private String familyName;
	public Name() {
		
	}
	public Name(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
}

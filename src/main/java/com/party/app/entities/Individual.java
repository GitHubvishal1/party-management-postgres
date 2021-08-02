package com.party.app.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Individual {

	public enum statusNum {
		INITIALIZED, VALIDATED, DECEASED
	}

	@Id
	private int id;
	private String gender;
	private String nationality;
	private String birthDate;
	private String title;
	private String givenName;
	private String familyName;
	private String middleName;
	private String fullName;
	private String location;

	@Enumerated(EnumType.STRING)
	private statusNum status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public statusNum getStatus() {
		return status;
	}

	public void setStatus(statusNum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Individual [id=" + id + ", gender=" + gender + ", nationality=" + nationality + ", birthDate="
				+ birthDate + ", title=" + title + ", givenName=" + givenName + ", familyName=" + familyName
				+ ", middleName=" + middleName + ", fullName=" + fullName + ", location=" + location + ", status="
				+ status + "]";
	}

	public Individual(int id, String gender, String nationality, String birthDate, String title, String givenName,
			String familyName, String middleName, String fullName, String location, statusNum status) {
		super();
		this.id = id;
		this.gender = gender;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.title = title;
		this.givenName = givenName;
		this.familyName = familyName;
		this.middleName = middleName;
		this.fullName = fullName;
		this.location = location;
		this.status = status;
	}

	public Individual() {
	}
}
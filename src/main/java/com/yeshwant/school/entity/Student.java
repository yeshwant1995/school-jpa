package com.yeshwant.school.entity;

import java.util.Calendar;

import jakarta.persistence.Entity;

@Entity
public class Student extends BaseEntity {

	private String givenName;
	private String middleName;
	private String surname;
	private Calendar dateOfBirth;
	private Character gender;
	private Calendar enrolmentDate;

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Calendar getEnrolmentDate() {
		return enrolmentDate;
	}

	public void setEnrolmentDate(Calendar enrolmentDate) {
		this.enrolmentDate = enrolmentDate;
	}

	@Override
	public String toString() {
		return "Student [givenName=" + givenName + ", middleName=" + middleName + ", surname=" + surname
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", enrolmentDate=" + enrolmentDate + "]";
	}

}

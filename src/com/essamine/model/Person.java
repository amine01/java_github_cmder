package com.essamine.model;

public class Person {
	private String firstName;
	private String lastName;
	private String job;
	private int age;
	private int phoneNumber;

	public Person(String firstName, String lastName, String job, int age,int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

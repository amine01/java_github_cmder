package com.essamine.model;

public class Person {
	private int age;
	private String firstName;
	private String lastName;
	private String job;



	public Person(int age, String firstName, String lastName, String job) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
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



}

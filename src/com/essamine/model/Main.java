package com.essamine.model;

public class Main {

	public static void main(String[] args) {
		Person[] persons=new Person[4];
		persons[0]=new Person("Daniel", "Dupon", "Teacher", 32);
		persons[1]=new Person("Duck", "Lemauvais", "Unemployed", 44);
		persons[2]=new Person("Michel", "lefils", "student", 23);
		persons[3]=new Person("cury", "ledocteur", "Doctor", 32);
		for(Person p:persons){
		 System.out.println(p);
		}
	}

}

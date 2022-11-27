package com.oop.inherit;

public class Programer extends Emloyee {
	// PROPERTY
	private String programLanguage;
	
	// CONSTRUCTOR
	public Programer(String name, String id, int salary, String language) {
		super(name,id,salary);
		setProgramLanguage(language);
	}
	
	// GET - SET
	public String getProgramLanguage() {
		return this.programLanguage;
	}
	public void setProgramLanguage(String value) {
		this.programLanguage = value;
	}

	// METHOD
	public void display() {
		super.display();
		System.out.println("language : " + getProgramLanguage());
	}
}

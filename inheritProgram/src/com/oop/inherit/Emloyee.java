package com.oop.inherit;

public class Emloyee {
	// property
	private String name;
	private String idSalary;
	private int salary;
	
	// constructor
	public Emloyee(String name, String id, int salary) {
		setName(name);
		setIdSalary(id);
		setSalary(salary);
	}
	
	// get set
	public String getName() {
		return this.name;
	}
	public String getIdSalary() {
		return this.idSalary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	public void setIdSalary(String value) {
		this.idSalary = value;
	}
	public void setSalary(int value) {
		this.salary = value;
	}
	// method
	public void display() {
		System.out.println("ten : " + getName());
		System.out.println("luong : " + getSalary());
	}
}

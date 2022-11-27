package com.oop.inherit;

import java.util.ArrayList;

public class SoftWareHouse {
	// PROPERTY
	private String softWareHouseName;
	private ArrayList<Emloyee> theStaffs;
	
	// CONSTRUCTOR
	public SoftWareHouse(String name) {
		setSoftWareHouseName(name);
		this.theStaffs = new ArrayList<Emloyee>();
	}
	
	// GET - SET
	public String getSoftWareHouseName() {
		return this.softWareHouseName;
	}
	public ArrayList<Emloyee> getTheStaffs() {
		return this.theStaffs;
	}
	
	public void setTheStaffs(ArrayList<Emloyee> value) {
		this.theStaffs = value;
	}
	public void setSoftWareHouseName(String value) {
		this.softWareHouseName = value;
	}
	
	// METHOD
	public void addStaffs(Emloyee emloyee) {
		theStaffs.add(emloyee);
	}
	
	public void displayThestaff() {
		for (Emloyee theStaff : theStaffs) {
			theStaff.display();
		}
	}
	
	public void displayTeamLeader() {
		for (Emloyee theStaff : theStaffs) {
			if(theStaff instanceof ProjectLeader) {
				theStaff.display();
			}
		}
	}
	
}

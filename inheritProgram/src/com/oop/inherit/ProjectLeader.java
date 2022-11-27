package com.oop.inherit;

import java.util.ArrayList;

public class ProjectLeader extends Programer {
	// PROPERTY
	private ArrayList<Programer> listMember;

	// CONSTRUCTOR
	public ProjectLeader(String name, String id, int salary, String language) {
		super(name, id, salary, language);
		// TODO Auto-generated constructor stub
		this.listMember = new ArrayList<Programer>();
	}
	
	// GET - SET
	public ArrayList<Programer> getListMember() {
		return this.listMember;
	}
	public void setListMember(ArrayList<Programer> value) {
		this.listMember = value;
	}
	
	// METHOD
	public void addMember(Programer programer) {
		listMember.add(programer);
	}
	
	public void displayTeamMember() {
		System.out.println(super.getName());
		System.out.println("my team member : ");
		for (Programer member : listMember) {
			member.display();
		}
		System.out.println("---------------------------");
	}
}

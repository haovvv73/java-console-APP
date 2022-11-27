package com.oop.inherit;

public class inheritOOP {
	public static void main(String[] args) {
		Emloyee p = new Programer("tuan", "P001", 1000, "java");
		
		ProjectLeader l = new ProjectLeader("hao", "L001", 1000, "javascript");
		ProjectLeader l2 = new ProjectLeader("hung", "L002", 1000, "PHP");
		
		l.addMember((Programer) p);
		
		SoftWareHouse h = new SoftWareHouse("HCMUS");
		h.addStaffs(l);
		h.addStaffs(l2);
		h.addStaffs(p);
		
		h.displayThestaff();
		System.out.println("----------------");
		h.displayTeamLeader();
//		l.displayTeamMember();
//		p.display();
//		l.display();
	}
}

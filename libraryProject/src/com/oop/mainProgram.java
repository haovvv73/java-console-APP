package com.oop;

import java.util.ArrayList;

public class mainProgram {
	
	public static void inChu(String word) {
		System.out.println(word);
	}

	public static void main(String[] args) {

		// testing
		Library hcmus = new Library("HCMUS"); 
		inChu(hcmus.getTheName());
		
		// user 
		hcmus.register("Gia_Hao");
		hcmus.register("anyname");
		
		// book
		Book[] arrBook = new Book[5];
		arrBook[0] = new Book("12","trai_hoa_vang","Nguyen_Nhat_Anh");
		arrBook[1] = new Book("13","ha_do","Nguyen_Nhat_Anh");
		arrBook[2] = new Book("14","phong_tro_co_ba_nguoi","Nguyen_Nhat_Anh");
		arrBook[3] = new Book("15","mat_biec","Nguyen_Nhat_Anh");
		arrBook[4] = new Book("16","kinh_van_hoa","Nguyen_Nhat_Anh");

		// add stock
		for(Book item : arrBook) {
			hcmus.addOneBook(item);
		}
		
		hcmus.lenOneBook("12", "Gia_Hao");
		hcmus.lenOneBook("16", "Gia_Hao");
		hcmus.lenOneBook("13", "anyname");
		hcmus.lenOneBook("14", "anyname");
		
		hcmus.returnOneBook("12");
		
		ArrayList<BorrowerRecord> listUser = hcmus.getNameOfBorrowers();
		for(BorrowerRecord item : listUser) {
			inChu(item.getTheName());
			inChu("danh sach book nguoi dung da muon");
			for(Book bk : item.getTheBorrowedBooks()) {
				bk.display();
			}
		}

		
//		hcmus.displayBooksAvailableForLoan();
//		hcmus.displayBooksOnLoan();



	}

}

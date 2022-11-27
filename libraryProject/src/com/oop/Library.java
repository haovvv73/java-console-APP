package com.oop;

import java.util.ArrayList;

public class Library {
	// PROPERTY
	private String theName;
	private ArrayList<Book> stateBooks;
	private ArrayList<BorrowerRecord> nameOfBorrowers;

	// CONTRUCTER
	public Library(String theName) {
		setTheName(theName);
		this.stateBooks = new ArrayList<Book>();
		this.nameOfBorrowers = new ArrayList<BorrowerRecord>();
	}

	// set - get

	private void setTheName(String theName) {
		this.theName = theName;
	}

	public String getTheName() {
		return this.theName;
	}
	
	public ArrayList<BorrowerRecord> getNameOfBorrowers(){
		return this.nameOfBorrowers;
	}

	// METHOD
	public void register(String aBorrowName) { // register user
		BorrowerRecord user = new BorrowerRecord(aBorrowName);
		nameOfBorrowers.add(user);
	}

	public void addOneBook(Book book) { // add book
		stateBooks.add(book);
	}

	public void displayBooksAvailableForLoan() {
		System.out.println("LIST BOOK AVAILABLE :");
		for (Book i : stateBooks) {
			if (i.getIsborrow() != true) {
				i.display();
			}
		}
	}

	public void displayBooksOnLoan() {
		System.out.println("LIST NOT BOOK AVAILABLE :");
		for (Book i : stateBooks) {
			if (i.getIsborrow()) {
				i.display();
			}
		}
	}

	public void lenOneBook(String aCatalogueNumber, String aBorrowName) {
		// lend event
		for (Book i : stateBooks) {
			// check is borrow
			if (i.getIsborrow() != true) {
				// check is library have this book
				if (i.isTheCatalogueNumber(aCatalogueNumber)) {
					// create new record
					BorrowerRecord borrowerRecord = new BorrowerRecord(aBorrowName);
					// record the book
					borrowerRecord.attachBook(i);
					// attach to the book
					i.attachBorrow(borrowerRecord);

					// attach record book to user
					// find user
					// check =y=> attach book
					for(BorrowerRecord banGhi : nameOfBorrowers) {
						if(banGhi.getTheName().equals(aBorrowName)) {
							banGhi.attachBook(i);
							break;
						}
					}
					
					break;
				}
			}
		}
	}

	public void returnOneBook(String aCatalogueNumber) {
		// return event
		for (Book bk : stateBooks) {
			// check is borrow
			if (bk.getIsborrow()) {
				// check is library have this book
				if (bk.isTheCatalogueNumber(aCatalogueNumber)) {
					bk.detachBorrow();

					// detach record book of user
					// find user
					// check =y=> detach book
					for(BorrowerRecord banGhi : nameOfBorrowers) {
						String name = bk.getBorrowerRecord().getTheName();
						if(banGhi.getTheName().equals(name) ) {
							banGhi.detachBook(bk);
							break;
						}
					}
					
					break;
				}
			}
		}
	}

}
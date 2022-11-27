package com.oop;

import java.util.ArrayList;

public class BorrowerRecord {
	// PROPERTY
	private String theName;
	private ArrayList<Book> theBorrowedBooks;

	// CONTRUCTER
	public BorrowerRecord(String theName) {
		setTheName(theName);
		this.theBorrowedBooks = new ArrayList<Book>();
	}

	// get
	public String getTheName() {
		return this.theName;
	}

	public ArrayList<Book> getTheBorrowedBooks() {
		return this.theBorrowedBooks;
	}

	// set
	private void setTheName(String theName) {
		this.theName = theName;
	}

	// METHOD
	public void attachBook(Book book) {
		theBorrowedBooks.add(book);
	}

	public void detachBook(Book book) {
		// duyet mang
		// tim id
		// delete
		for (Book item : theBorrowedBooks) {
			// check is book borrow
			if (book.isTheCatalogueNumber(item.getCatalogue())) {
				theBorrowedBooks.remove(item);
				break;
			}
		}

	}
}

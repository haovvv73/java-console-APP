package com.oop;

public class Book {
	// PROPERTY
	private String theCatalogueNumber;
	private String theTittle;
	private String theAuthor;
	private boolean isBorrow;
	private BorrowerRecord borrowerRecord;

	// CONTRUCTER
	public Book(String theCatalogueNumber, String theTittle, String theAuthor) {
		setCatalogue(theCatalogueNumber);
		setTheTittle(theTittle);
		setTheAuthor(theAuthor);
		setBorrowerRecord(null);
		setIsborrow(false);
	}

	// set
	private void setTheTittle(String theTittle) {
		this.theTittle = theTittle;
	}

	private void setTheAuthor(String theAuthor) {
		this.theAuthor = theAuthor;
	}

	private void setCatalogue(String theCatalogueNumber) {
		this.theCatalogueNumber = theCatalogueNumber;
	}

	private void setBorrowerRecord(BorrowerRecord borrowerRecord) {
		this.borrowerRecord = borrowerRecord;
	}

	private void setIsborrow(boolean value) {
		this.isBorrow = value;
	}

	// get
	public String getCatalogue() {
		return this.theCatalogueNumber;
	}

	public String getTheTittle() {
		return this.theTittle;
	}

	public String getTheAuthor() {
		return this.theAuthor;
	}

	public BorrowerRecord getBorrowerRecord() {
		return this.borrowerRecord;
	}

	public boolean getIsborrow() {
		return this.isBorrow;
	}

	// METHOD
	public void attachBorrow(BorrowerRecord borrowerRecord) {
		setBorrowerRecord(borrowerRecord);
		setIsborrow(true);
	}

	public void detachBorrow() {
		borrowerRecord.detachBook(this);
		setIsborrow(false);
	}

	public boolean isTheCatalogueNumber(String catalogueNumber) {
		if (this.theCatalogueNumber.equals(catalogueNumber)) {
			return true;
		}
		return false;
	}

	public void display() {
		System.out.println("catalogue number : " + getCatalogue());
		System.out.println("The Tittle : " + getTheTittle());
		System.out.println("the Author : " + getTheAuthor());
		System.out.println("-----------------");
	}
}

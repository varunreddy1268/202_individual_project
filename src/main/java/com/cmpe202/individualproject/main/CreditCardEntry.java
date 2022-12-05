package com.cmpe202.individualproject.main;


import java.math.BigInteger;
import java.time.LocalDate;

public class CreditCardEntry {
	
	String cardNumber;
	LocalDate expirationDate;
	String cardHolderName;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}



	public CreditCardEntry(String cardNumber, LocalDate expirationDate, String cardHolderName) {
		// TODO Auto-generated constructor stub
		this.cardNumber = cardNumber;
		this.expirationDate =  expirationDate;
		this.cardHolderName = cardHolderName;
	}
	public CreditCardEntry(BigInteger cardNumber, LocalDate parse, String cardHolderName){

	}
	

}

package com.cmpe202.individualproject.handlers;

import java.math.BigInteger;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class MasterCard implements CreditCardHandler {
    CreditCardHandler nextHandler;

    public MasterCard() {
        nextHandler = new Visa();
    }

    @Override
    public String checkCreditCardType(CreditCardEntry creditCardEntry) {
    	String number = creditCardEntry.getCardNumber();
       // String number = a.toString();
        String result = "";
       
        if ( number.length() <= 19 && number.length() > 0) {
            //String fDigit = number.substring(0, 1);
            //int sDigit = Integer.parseInt(number.substring(1, 2));
            //if (fDigit.equals("5") && sDigit >= 1 && sDigit <= 5 && number.length() == 16) {
        	if (number.matches("[0-9]+") && number.length() > 0 && number.length() == 16 && number.charAt(0) == '5' && number.charAt(1) >= '1' && number.charAt(1) <= '5') {
                result = "Master Card";
            } else {
                return nextHandler.checkCreditCardType(creditCardEntry);
            }
        } else {
        	result = "ERROR !! Card is Invalid";
            System.out.println("Invalid card type!");
        }
        return result;
    }
}

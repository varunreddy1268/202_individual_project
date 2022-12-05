package com.cmpe202.individualproject.handlers;

import java.math.BigInteger;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class Amex implements CreditCardHandler {
    CreditCardHandler nextHandler;

    public Amex() {
        nextHandler = new Discover();
    }

    @Override
    public String checkCreditCardType(CreditCardEntry creditCardEntry) {
    	String number = creditCardEntry.getCardNumber();
        //String number = a.toString();
        String result = "";
       // String fDigit = number.substring(0, 1);
        //int sDigit = Integer.parseInt(number.substring(1, 2));
      
       // if (fDigit.equals("3") && number.length() == 15 && (sDigit == 4 || sDigit == 7)) {
        if(number.matches("[0-9]+") && number.length() > 0 )
        {
        	
        
        if( number.length() == 15 && number.charAt(0) == '3' && (number.charAt(1) == '4' || number.charAt(1) == '7')) {
            result = "American Express Card";
        } else {
            return nextHandler.checkCreditCardType(creditCardEntry);
        }
        }
        else
        {
        	result = "ERROR !! Card is Invalid";
        	System.out.println("Invalid card type!");
        }
        return result;
    }
}

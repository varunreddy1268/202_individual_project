package com.cmpe202.individualproject.handlers;

import java.math.BigInteger;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class Visa implements CreditCardHandler {
    CreditCardHandler nextHandler;

    public Visa() {
        nextHandler = new Amex();
    }

    @Override
    public String checkCreditCardType(CreditCardEntry creditCardEntry) {
    	String number = creditCardEntry.getCardNumber();
        //String number = a.toString();
        String result = "";
      //String fDigit = number.substring(0, 1);

       // if (fDigit.equals("4") && (number.length() == 13 || number.length() == 16)) {
       
        if(number.matches("[0-9]+") && number.length() > 0)
        {
        if ( number.length() == 13 || number.length() == 16 && number.charAt(0) == '4') {
            result = "Visa Card";
        } else {
            return nextHandler.checkCreditCardType(creditCardEntry);
        }
        }
        else
        {	result = "ERROR !! Card is Invalid";
        	System.out.println("Invalid card type!");
        }
        return result;
    }
}


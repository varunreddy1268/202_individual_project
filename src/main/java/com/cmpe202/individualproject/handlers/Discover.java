package com.cmpe202.individualproject.handlers;

import java.math.BigInteger;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class Discover implements CreditCardHandler {
    CreditCardHandler nextHandler;

    public Discover() {
    }

    @Override
    public String checkCreditCardType(CreditCardEntry creditCardEntry) {

    	String number = creditCardEntry.getCardNumber();
        //String number = a.toString();
        String result = "";
        //String fourDigit = number.substring(0, 4);
       // int sDigit = Integer.parseInt(number.substring(1, 2));
        
        //if (fourDigit.equals("6011") && number.length() == 16) {
        if (number.matches("[0-9]+") && number.length() > 0 && number.length() == 16 && number.startsWith("6011")) {
            result = "Discover Card";
        } else {
            result = "ERROR !! Card is Invalid";
        }
        return result;
    }
}

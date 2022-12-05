package com.cmpe202.individualproject.reader;

import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import com.cmpe202.individualproject.main.CreditCardEntry;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONReader implements Reader {
    File file;

    public JSONReader() {
    }

    public JSONReader(File file) {
        this.file = file;
    }

    @Override
    public List<CreditCardEntry> readFile(String inputFile) {
        FileReader fr;
        List<CreditCardEntry> result = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
//        String jsonFile = file.getAbsolutePath();
        System.out.print("ABSOLUTEEE PATHHHHH ");
        System.out.println(file.getAbsolutePath());
        List<String> cardDetails;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date expDate = new Date();
        System.out.print("FILEEEEEEE in JSON READER ");
        System.out.println(file);
        try {
            fr = new FileReader(file);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(fr);

            //JSONObject jsonObject = (JSONObject) obj;
            JSONArray cards = (JSONArray) obj;


            for (int i = 0; i < cards.size(); i++) {
                cardDetails = new ArrayList<>();
                String entries = cards.get(i).toString();
                String[] eachCardEntry = entries.split(",");
                
                for (String each : eachCardEntry) {
                	System.out.println("EACH :");
                    System.out.println(each);
                    String[] split1 = each.split(":");
                    String replace1 = split1[1].replaceAll("}", "");
                    String replace2 = replace1.replaceAll("\\\\", "");
                    cardDetails.add(replace2);
                }
                System.out.println("CARD DETAILS :");
                System.out.println(cardDetails);
                String a = cardDetails.get(1);
                String b = cardDetails.get(2).replaceAll("\"", "");
                System.out.println("B DATEEEE:  ");
                System.out.println(b);
                String name = cardDetails.get(0).replaceAll("\"", "");
                System.out.println("NAMEEEE:");
                System.out.println(name);
                a = a.replace("\"", "");
                //long cNumber = long.parse(a);
                //BigInteger cNumber;
                //if (a.matches("[0-9]+") && a.length() > 2) {
                 //cNumber = new BigInteger(a);
                
                b = b.replace("\"", "");
                System.out.println("B DATEEEE:  ");
                System.out.println(b);
                DateTimeFormatter df = DateTimeFormatter.ofPattern("M/dd/yyyy");
                LocalDate eDate = LocalDate.parse(b, df);

                //result.add(new CreditCardEntry(cNumber, eDate, name));
                result.add(new CreditCardEntry(a, eDate, name));
                //}
				/*
				 * else { cNumber = BigInteger.valueOf(0000000000);
				 * 
				 * b = b.replace("\"", ""); DateTimeFormatter df =
				 * DateTimeFormatter.ofPattern("MM/yy"); LocalDate eDate = LocalDate.parse(b,
				 * df);
				 * 
				 * result.add(new CreditCardEntry(cNumber, eDate, name)); }
				 */
              
                }
               
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

package com.cmpe202.individualproject.reader;

import com.cmpe202.individualproject.main.CreditCardEntry;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JSONReaderTest {
    @Test
    void checkReadJson() {
        String filePath = "src/test/java/sampleFiles/json_input.json";

        JSONReader jsonReaderObj = new JSONReader(new File(filePath));
        List<CreditCardEntry> result = jsonReaderObj.readFile("src/test/java/sampleFiles/json_input.json");
        String name = result.get(0).getCardHolderName();
        String cardNumber = result.get(0).getCardNumber();
        Assert.assertEquals(name, "John Doe");
        Assert.assertTrue(result.size() == 12);
        Assert.assertEquals( cardNumber, "5567894523129089");
    }
}
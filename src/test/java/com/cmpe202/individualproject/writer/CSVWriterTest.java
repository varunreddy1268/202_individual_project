package com.cmpe202.individualproject.writer;

import com.cmpe202.individualproject.main.OutputEntry;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVWriterTest {

    @Test
    void checkCSVWrite() {
    	String cardNumber = "5410000000000000";
        String cardType = "Master Card";
        CSVWriter csvWriterObj = new CSVWriter();
        List<OutputEntry> result = new ArrayList<>();
        result.add(new OutputEntry(cardNumber, cardType));
        String path = "src/test/java/sampleFiles/json_output.json";
        csvWriterObj.writeToFile(result, path);
        File file = new File(path);

        Assert.assertEquals(file.exists(), true);
        Assert.assertEquals(cardNumber, "5410000000000000");
        Assert.assertEquals(cardType, "Master Card");

    }
}
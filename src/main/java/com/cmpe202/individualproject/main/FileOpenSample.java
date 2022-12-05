package com.cmpe202.individualproject.main;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileOpenSample {

    public static void main(String[] args) throws IOException {
        //text file, should be opening in default text editor
        File file = new File("C:/Users/Checkout/Desktop/202/supriya-project/individual-project-supriyameduri9/Files/Git/src/test/java/sampleFiles/json_input.json");
        
        //first check if Desktop is supported by Platform or not
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
        //let's try to open PDF file
        file = new File("C:/Users/Checkout/Desktop/202/supriya-project/individual-project-supriyameduri9/Files/Git/src/test/java/sampleFiles/json_input.json");
        if(file.exists()) desktop.open(file);
    }


}

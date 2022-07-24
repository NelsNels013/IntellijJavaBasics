package com.syntax.class30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesCreateFileDemo {

    public static void main(String[] args) throws IOException {
        // Path where we want ot create the file
        String path = "Files/Mante.properties";
        //We need to go to that path to create this file
        //programmatically this is how we do that
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //Create the object of properties class to store properties inside the file
        Properties properties = new Properties();
        //Store key value pair inside the object
        properties.setProperty("Funny", "true");
        //Store this data in the form of a file on our hard drive
        properties.store(fileOutputStream, "A new property has been added");
        //Close that file
        fileOutputStream.close();
    }

}

package com.syntax.class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        //Get the path of a file
        /*
        right clcik on any directory or package
        new -> File give any name and extension
         */
        /*
        Steps to get the file path in intellij
        1) right click on any file
        2) click on get path reference
        3) select content root path
         */
        String path="Files/Config.properties";
        //Navigate to this location with the help of FileInputStream class
        //If we want to read the data or FileOutputStream if we want to write
        //the data to file

        FileInputStream fileInputStream = new FileInputStream(path);

        // Now we need a class that understands how to read the data from this file type
        Properties properties = new Properties();
        //loading the data from the file inside the properties Object
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));

        //close this file to save system resources
        fileInputStream.close();
    }
}

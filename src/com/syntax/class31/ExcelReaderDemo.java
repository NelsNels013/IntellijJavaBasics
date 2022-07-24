package com.syntax.class31;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo {
    public static void main(String[] args) throws IOException {

        List<Map<String, String>> excelData = ExcelReader.read(Constants.ExcelFilePath);

    }
}

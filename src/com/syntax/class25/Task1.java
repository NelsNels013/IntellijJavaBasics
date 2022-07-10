package com.syntax.class25;

public class Task1 {
    /*
Create a class File that will have the following behaviors:
open, edit, close. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
  Example: to open .java file we need notepad++ or sublime text, to open .doc file
  we need Microsoft Word to be installed etc
 */
    public static void main(String[] args) { //do all this after the methods
        File[] files = {new JavaFile(), new PdfFile(), new WordFile()};
        int[] numbers={10,20,30};
        for(File file:files){
            file.open();
            file.edit();
            file.close();


        }

        //new JavaFile().open();
        //JavaFile javaFile=new JavaFile();
       // javaFile.open();
    }
}

abstract class File{
    private String name="MSOfficeFile"; //just an example, not a part of the task
    abstract void open();
    void edit(){
        System.out.println(name);//example
        System.out.println("Editing the file");
    }
    void close(){
        System.out.println("Closing the file");
    }
}

class JavaFile extends File{

    void open(){
        System.out.println("Use Intellij to open Java files");
    }

    @Override
    void edit() {
        System.out.println("Editing the file with intellij");
    }
}

class WordFile extends File{
    @Override
    void open() {
        System.out.println("Use Microsoft word to open the word file");
    }
}

class PdfFile extends File{
    @Override
    void open() {
        System.out.println("Use Adobe reader to open the pdf file");
    }
}

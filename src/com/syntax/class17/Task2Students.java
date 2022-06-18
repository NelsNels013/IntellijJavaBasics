package com.syntax.class17;

public class Task2Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Task2Students task2students=new Task2Students();
        task2students.name="Arif007";
        task2students.id="JB123";
        task2students.numberOfStudents=1;// if we are inside the same class we can access static variables inside static
        //methods by just wrting the name of that variable we don't need to create an object
        System.out.println(task2students.name);
        System.out.println(task2students.id );
        System.out.println(numberOfStudents);

        Task2Students task2students2=new Task2Students();
        task2students2.name="Arif008";
        task2students2.id="JB1234";
        task2students2.numberOfStudents=4;
        System.out.println(task2students2.name);
        System.out.println(task2students2.id );
        System.out.println(numberOfStudents);
    }
}

package com.syntax.class24;

public class StudentTester {
    public static void main(String[] args) {
        Student[] student={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student st:student){
            st.study();
            st.practice();
            st.doHomework();
        }
        /*
        for(inti=0; i<students.length; i++){
        students[i].study();
        students[i].practice();
        students[i].doHomework();
        }
         */
    }
}

package com.syntax.class20;

public class Task3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour
    of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and
    PianoTeacher that would have it their own features and behaviour. Test all 4 classes
     */
    public static void main(String[] args) {
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Adem";
        chemistryTeacher.favoriteChemSubject="Organic";
    }
}
    class Teacher {
        String name;
        String typeOfTeacher;

        void teach() {
            System.out.println(name + " Teaches " + typeOfTeacher);
        }
    }

    class MatchTeacher extends Teacher {
        String favoriteMatchSubject;

        public void teachesMatch() {
            System.out.println(name + " " + " Teaches Math and his favorite math subject is " + favoriteMatchSubject);
        }
    }

    class ChemistryTeacher extends Teacher {
        String favoriteChemSubject;

        public void teachesChem() {
            System.out.println(name + " " + " teaches Chemistry and his favorite math subject is " + favoriteChemSubject);
        }
    }

    class pianoTeacher extends Teacher {
        String favoriteModelOfPiano;

        public void teachesPiano() {
            System.out.println(name + " " + " teaches Chemistry and his favorite Piano Model is " + favoriteModelOfPiano);
        }
    }


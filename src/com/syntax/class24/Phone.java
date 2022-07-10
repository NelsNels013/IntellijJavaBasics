package com.syntax.class24;

public abstract class Phone {

    abstract void displayPictures();
    abstract void unlock();

    void sendText(){
        System.out.println("Use the messenger app to send msg");
    }
}

class Iphone extends Phone{
    @Override
    void displayPictures(){
        System.out.println("Use the Photos app to display the pictures");
    }
    @Override
    void unlock(){
        System.out.println("Use the faceID to unlock the phone");
    }
}

class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Use Gallery app to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("Use fingerprint sensor or face unlock to unlock your phone");
    }
}

class Tester{
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.displayPictures();

    }
}

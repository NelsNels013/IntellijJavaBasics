package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
        /*WebDriver webDriver=new Safari();
        webDriver.startBrowser();
        webDriver.openUrl("WWW.google.com");
        webDriver.testLoginPage();
        webDriver.closeBrowser();*/

        WebDriver[] browsers={new Chrome(), new Safari(), new IE(), new FireFox()};

        for(WebDriver driver:browsers){

            driver.startBrowser();
            driver.openUrl("WWW.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }

        /*for(int i=0; i<browsers.length; i++){      //normal forloop
            browsers[i].startBrowser();              //advance forloop above is better
            browsers[i].openUrl("WWW.google.com");
            browsers[i].testLoginPage();
            browsers[i].closeBrowser();
        }*/

       /* WebDriver v=new FireFox();

        Chrome chrome=(Chrome) v;

        double num=10.0;
        int num2=(int)num;*/

    }
}

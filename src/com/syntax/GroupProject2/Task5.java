package com.syntax.GroupProject2;

public class Task5 {
    // implementation of the picture task
}

interface WebDriver1 {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver1 extends WebDriver1, TakesScreenshot {
    void navigate();
}

class ChromeDriver1 implements RemoteWebDriver1 {

    @Override
    public void open() {
        System.out.println("opens Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("closes Chrome browser");
    }

    @Override
    public String getTitle() {
        String title = "gets title of Chrome browser's page";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("gets a screenshot of Chrome browser's page");
    }

    @Override
    public void navigate() {
        System.out.println("navigates to desired Chrome browser's page");
    }
}

class FirefoxDriver1 implements RemoteWebDriver1 {

    @Override
    public void open() {
        System.out.println("opens Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("closes Firefox browser");
    }

    @Override
    public String getTitle() {
        String title = "gets a title of Firefox browser's page";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("gets a screenshot of Firefox browser's page");
    }

    @Override
    public void navigate() {
        System.out.println("navigates to desired Firefox browser's page");
    }
}

class SafariDriver implements RemoteWebDriver1 {

    @Override
    public void open() {
        System.out.println("opens a Safari browser");
    }

    @Override
    public void close() {
        System.out.println("closes Safari browser");
    }

    @Override
    public String getTitle() {
        String title = "gets a title of Safari browser's page";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("gets a screenshot of Safari browser's page");
    }

    @Override
    public void navigate() {
        System.out.println("navigates to desired Safari browser's page");
    }
}

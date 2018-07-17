package com.fox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RandomEmailCreation {
    private String theCreatedEmail;
    private WebDriver theDriver;

    public RandomEmailCreation(String theDriverType){
        //I will use the constructor to check the driver of the targeted browser

        if (theDriverType.toLowerCase().equals("firefox")){
            this.theDriver = new FirefoxDriver(); // a new object for firefox driver is initiated
            System.setProperty("Webdriver.gecko.driver"," /usr/local/bin/geckodriver"); // setting the path of the driver
        }else{
            this.theDriver = new ChromeDriver(); // a new object for Chrome driver is initiated
            System.setProperty("Webdriver.chrome.driver"," /media/moerizk/188ECC358ECC0D66/QC/ChromeBrowserDriver/chromedriver");// setting the path of the driver
        }

    }

    public void createFakeEmail(){
        theDriver.get("http://www.yopmail.com/en/");
        theDriver.findElement(By.xpath(" //a[@href='email-generator.php']")).click();
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            System.out.println("error");
        }
        System.out.println(theDriver.findElement(By.xpath("//input[@id='login']")).isDisplayed());
        this.theCreatedEmail = theDriver.findElement(By.xpath("//input[@id='login']")).getAttribute("value");
        System.out.println(theCreatedEmail);



    }
}

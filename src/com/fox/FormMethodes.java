package com.fox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormMethodes {

    public static void main(String[] args) {

        WebDriver mfDriver = new FirefoxDriver();
        System.setProperty("Webdriver.gecko.driver"," /usr/local/bin/geckodriver");
        mfDriver.get("https://www.makemytrip.com/");
        System.out.println("This is before click on the multi trip");
        checking(mfDriver);
        mfDriver.findElement(By.cssSelector("label[for='switch__input_3']")).click();
       // checking(mfDriver);
        mfDriver.findElement(By.xpath("//div[@class='switchBTN']/label[@for='switch__input_1']")).click();
        if ( mfDriver.findElement(By.xpath("//input[@readonly='readonly' and @id='hp-widget__return']")).isEnabled()){
            System.out.println("the element is disabled");
        }
    }
    public static void checking(WebDriver mfDriver){
        if (mfDriver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed()){
            System.out.println("the element is visible");
        }else {
            System.out.println("this element desapered");
        }
    }
}

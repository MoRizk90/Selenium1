package com.fox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserInvokation {

        public static void main(String[] args) {
                // write your code here
//                ChromeOptions options = new ChromeOptions();
//                options.setBinary("/media/moerizk/188ECC358ECC0D66/QC/ChromeBrowserDriver/chromedriver");
                System.setProperty("Webdriver.gecko.driver"," /usr/local/bin/geckodriver");
                WebDriver driver = new FirefoxDriver(); //This one is used to open the fire fox dr
                driver.get("http://www.echoecho.com/htmlforms10.htm");
//                driver.findElement(By.xpath("//span[text()='اتحاد شعار كله راايح ']")).click();
//                driver.findElement(By.xpath("//div[@spellcheck='true']")).sendKeys("This next test will be sent for 99 times , thank you for your patience");
//                driver.findElement(By.xpath("//button[@class='_2lkdt']")).click();
//                for (int i = 0; i < 200; i++){
//                        driver.findElement(By.xpath("//div[@spellcheck='true']")).sendKeys("Whats app foxy attack");
//                        driver.findElement(By.xpath("//button[@class='_2lkdt']")).click();
//                }
                int theCountOfRadionBtn = driver.findElements(By.xpath("//input[@name='group1']")).size();
                String myValue;
                for (int i = 0; i < theCountOfRadionBtn; i++){
                       myValue = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
                        System.out.println(myValue);
                        if (myValue.toLowerCase().equals("cheese")){
                                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
                        }
                }



        }




}

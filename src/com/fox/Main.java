package com.fox;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
      RandomEmailCreation createEmail = new RandomEmailCreation("firefox");
      createEmail.createFakeEmail();
    }
}

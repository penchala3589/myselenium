package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {
    public static void main(String[] args) {
        //Using Chrome
        System.setProperty("webdriver.chrome.driver", "//Users//krishnachaitanya//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        // Using FireFox
        System.setProperty("webdriver.gecko.driver", "//Users//krishnachaitanya//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        // Using Edge
        System.setProperty("webdriver.edge.driver", "//Users//krishnachaitanya//Downloads//drivers//msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
        driver.close();
    
    }
    
}

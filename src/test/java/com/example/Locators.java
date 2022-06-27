package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "//Users//krishnachaitanya//Downloads//drivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/practice-project");
        driver.findElement(By.id("name")).sendKeys("Test");
    }
}

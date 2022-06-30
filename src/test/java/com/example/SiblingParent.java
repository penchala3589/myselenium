package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingParent {
    public static void main (String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "//Users//krishnachaitanya//Downloads//drivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[text()='Practice']/following-sibling::button[text()='Login']")).getText());
        driver.quit();
    }
    
}

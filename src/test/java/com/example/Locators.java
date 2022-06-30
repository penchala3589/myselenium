package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "//Users//krishnachaitanya//Downloads//drivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Test");
        driver.findElement(By.name("inputPassword")).sendKeys("email");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Name");
        driver.findElement((By.cssSelector("input[placeholder = 'Email']"))).sendKeys("test.gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345678");
        driver.findElement((By.xpath("//button[@class='reset-pwd-btn']"))).click();
        System.out.println(driver.findElement((By.xpath("//p[@class = 'infoMsg']"))).getText());
        driver.findElement((By.xpath("//div/button[@class='go-to-login-btn']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("test");
        driver.findElement((By.cssSelector("input[type*='pass']"))).sendKeys("rahulshettyacademy");
        driver.findElement((By.id("chkboxTwo"))).click();
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
    }
}

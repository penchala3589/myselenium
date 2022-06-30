package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
    public static void main (String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "//Users//krishnachaitanya//Downloads//drivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Test");
        String password = getPassword(driver);
        Thread.sleep(3000);
        driver.findElement((By.xpath("//div/button[@class='go-to-login-btn']"))).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Test");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class = 'login-container']/h2")).getText(), "Hello Test,");
        driver.findElement(By.xpath("//div[@class = 'login-container']/button")).click();
        driver.quit();
    }
    public static String getPassword(WebDriver driver) throws InterruptedException{
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement((By.xpath("//button[@class='reset-pwd-btn']"))).click();
        System.out.println(driver.findElement((By.xpath("//p[@class = 'infoMsg']"))).getText());
        String passwordText = driver.findElement((By.xpath("//p[@class = 'infoMsg']"))).getText();
        String[] passwordarray = passwordText.split("'");
        System.out.println(passwordarray);
        String password = passwordarray[1].split("'")[0];
        System.out.println(password);
        return password;

    }
}

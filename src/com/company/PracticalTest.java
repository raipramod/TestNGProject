package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticalTest {

    @Test
    void TestLogin() {

        String user_name = "admin";
        String pass_word = "password";

        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");


        WebElement userName = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        userName.sendKeys(user_name);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys(pass_word);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();

        WebElement message = driver.findElement(By.tagName("h4"));
        String result = message.getText();
        if (result == "Login info is correct") {
            System.out.println("Passed");
        } else {
            Assert.fail("Failed");
        }
    }

    @Test
    void TestLogin2() {

        String user_name = "admin";
        String pass_word = "admin";

        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");


        WebElement userName = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        userName.sendKeys(user_name);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys(pass_word);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();

        WebElement message = driver.findElement(By.tagName("h4"));
        String result = message.getText();
        if (result == "Login info is correct") {
            System.out.println("Passed");
        } else {
            Assert.fail("Failed");
        }
    }
}

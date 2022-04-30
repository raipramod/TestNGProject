package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
        driver.get("https://javaguide.technologychannel.org/");

        List<WebElement> allLinks =driver.findElements(By.tagName("a"));
        for (WebElement link :allLinks){


        }

    }
}


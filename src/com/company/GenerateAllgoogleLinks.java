package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class GenerateAllgoogleLinks {
    public static void main(String[] args) throws IOException {

        LinkedList<String> allSitelink = new LinkedList<String>();
        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
        driver.get("https://javaguide.technologychannel.org/");


        driver.get("https://www.google.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement link : allLinks) {
            allSitelink.add(link.getAttribute("href"));

        }
        for (String link : allSitelink) {
            FileWriter myWriter = new FileWriter("myfile.txt", true);
            myWriter.write(link + "\n");
            myWriter.close();

        }

    }
}

package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class MainWork {
    public static void main(String[] args) throws IOException, InterruptedException {
        LinkedList<User> users = new LinkedList<User>();
        users.add(new User("admin", "password"));
        users.add(new User("passsword", "password"));
        users.add(new User("admin", "admin"));
        users.add(new User("admin", "admin"));

        for (User u : users) {
            u.checkLogin();
        }
    }

}


class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void checkLogin() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bishworaj100.github.io/reactloginapp/");
        WebElement username = driver.findElement(By.id("mui-1"));
        username.sendKeys(this.username);

        WebElement password = driver.findElement(By.id("mui-2"));
        password.sendKeys(this.password);

        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/button"));
        button.click();

        WebElement message = driver.findElement(By.tagName("h4"));
        String result = message.getText();

        if (result.equals("Login info is correct")) {
            FileWriter myWriter = new FileWriter("result.txt", true);
            myWriter.write("Login Test Case Passed for user " + this.username + "\n");
            myWriter.close();
            System.out.println("Login Test Case Passed");
        } else {
            FileWriter myWriter = new FileWriter("result.txt", true);
            myWriter.write("Login Test Case Failed for " + this.username + "\n");
            myWriter.close();
            System.out.println("Login Test Case Failed");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
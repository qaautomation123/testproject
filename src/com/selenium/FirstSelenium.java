package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazim\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://outlook.com");
            Thread.sleep(300);
            driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader']")).click();
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("thanim@yahoo.com");
            Thread.sleep(10);
            String actresult = driver.findElement(By.xpath("//div[text()='Sign in']")).getText();
            System.out.println(actresult);
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        }catch (Exception hasan){
            System.out.println(hasan);
        }
    }
}

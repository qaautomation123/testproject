package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alertTest {
    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazim\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.ironspider.ca//forms//checkradio.htm");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[@value='red']")).isDisplayed();
            driver.findElement(By.xpath("//input[@value='red']")).click();
            if (driver.findElement(By.xpath("//input[@value='red']")).isSelected());{
                System.out.println("Passed");
            }

        }catch (Exception hasan){
            System.out.println(hasan);
        }
    }
}

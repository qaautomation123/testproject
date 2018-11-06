package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestMouseOver {
    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazim\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");

            Actions act = new Actions(driver);
            act.moveToElement(driver.findElement(By.xpath("//a[@title='Women']"))).build().perform();
            Thread.sleep(7000);
            driver.findElement(By.xpath("//a[@title='T-shirts']")).click();



        }catch (Exception hasan){
            System.out.println(hasan);
        }
    }
}

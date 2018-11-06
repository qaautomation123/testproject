package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testingalert {
    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazim\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("C://Users//Nazim//Desktop//FrameTest//Alert.html");
            driver.findElement(By.xpath("//button[text()='Try it']")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Thread.sleep(5000);
            Alert alert = driver.switchTo().alert();
            ((Alert) alert).accept();
            driver.quit();


        }catch (Exception hasan){
            System.out.println(hasan);
        }
    }
}

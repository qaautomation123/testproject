package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class selecttest {
    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazim\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[@class='login']")).click();
            driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test@test.com");
            driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

            WebElement elm = driver.findElement(By.xpath("//select[@id='days']"));
            Select sc = new Select(elm);
            sc.selectByValue("3");

            WebElement elm1 = driver.findElement(By.xpath("//select[@id='months']"));
            Select sc1 = new Select(elm1);
            sc1.selectByValue("5");

            WebElement elm2 = driver.findElement(By.xpath("//select[@id='months']"));
            Select sc2 = new Select(elm2);
            sc2.selectByVisibleText("2007");



        }catch (Exception hasan){
            System.out.println(hasan);
        }
    }
}

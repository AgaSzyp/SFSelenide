package com.britenet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Selenide {
    WebDriver driver;

    @Test
    public void openBrowser()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://kozminski--qa.sandbox.my.site.com/s/recruitment?language=en_US");

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='radio-1-21']//parent::span/label/span)[1]")));
        WebElement username =driver.findElement(By.xpath("(//input[@id='radio-1-21']//parent::span/label/span)[1]"));
        username.click();


       // driver.close();
    }
}


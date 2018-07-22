package com.xpagesbeast.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSuite {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/webdrivers/geckodriver.exe");
		//"webdriver.chrome.driver"
		//"webdriver.ie.driver"
        driver = new FirefoxDriver();
        
        /*wait for the element up to 10 seconds until it gives up.*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String baseURL = "http://www.google.com";
        driver.get(baseURL);	
        
        String xpathExpression = "/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]";
        String searchElementById = "lst-ib";
        
        driver.findElement(By.id(searchElementById)).sendKeys("XPages Rocks!");
        //driver.findElement(By.xpath(xpathExpression)).click();
       // driver.findElement(By.linkText("Google Search")).click(); //error because its an Input element
        driver.findElement(By.linkText("Gmail")).click(); //a tag, case sensitive.
        
        //elements with multiple class names will fail.  Use XPath.
        
        driver.findElement(By.cssSelector(""));
	}

}

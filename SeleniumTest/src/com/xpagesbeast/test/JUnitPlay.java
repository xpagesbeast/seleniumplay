package com.xpagesbeast.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JUnitPlay {

	WebDriver driver;
	String baseURL = "http://cbcdev.canalbarge.com/bmr/2.6/BMR_MobUI.nsf/UnpMain.xsp";
	TestUser user;
	
	//No main method needed.
	
	//multiple test methods may exist, this code will run first.
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed Before any Class method : setupBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//executes once 
		System.out.println("Executed once after everything is done and before setup.  tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed Before test : Setup Begin");
		//setup test user
		user = new TestUser();
		user.setWrongpassword("sli092l");
		user.setPassword("12358");
		user.setUsername("tester");
		
		
		//System.setProperty("webdriver.gecko.driver", "/webdrivers/geckodriver.exe"); (Windows)
		System.setProperty("webdriver.gecko.driver", "/home/slobodan/libraries/geckodriver");
		
		//setup driver (if you move this before teh system property, you can see a junit fail)
				driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		//now perform the test
		System.out.println("Executed Before Test : Setup End.");
	}
	
	@Test
	public void testSuccessfulLogin() {
		//write everything you want to test here.
		System.out.println("testExecuting successful Login");
		driver.get(baseURL);
		
		System.out.println("Logging in.");
		//clear text box
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		//login
		driver.findElement(By.name("username")).sendKeys(user.getUsername());
		driver.findElement(By.name("password")).sendKeys(user.getPassword());
		driver.findElement(By.tagName("button")).click();
		
		//fail("TEST 1: Not yet implemented");
	}
	

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed After test : tearDown");
		//
	}

	
	
	@Test
	public void testInvalidLogin() {
		//write everything you want to test here.
		System.out.println("Executing invalid Login");
		driver.get(baseURL);
		
		System.out.println("Logging in.");
		//clear text box
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		//login
		driver.findElement(By.name("username")).sendKeys("slkjf");
		driver.findElement(By.name("password")).sendKeys("209smss");
		driver.findElement(By.tagName("button")).click();
		
		//fail("TEST 2: Not yet implemented");
		driver.findElement(By.id("view:_id1:_id123:addlink")).click();
	}

}

package com.xpagesbeast.test;



public class TestSuiteClass {

	public static void main(String[] args) {
		
		WebDriver ffDriver;
		ffDriver = new FirefoxDriver(); //FireFox browser
		String baseURL = "https://cbcdev.canalbarge.com/operations/tsgmobile_Lite.nsf/UnpTasks.xsp";
		
		//open the website
		ffDriver.get(baseURL);
		
		LoginPage loginPage = new LoginPage(); //represents the html login page
		
		ffDriver.findElement(By.xpath(loginPage.getUserNameXPath())).sendKeys(loginPage.getLogin());
		ffDriver.findElement(By.xpath(loginPage.getPasswordXPath())).sendKeys(loginPage.getPassword());		
		ffDriver.findElement(By.xpath(loginPage.getButtonXPath())).click();
		
		//find by partial id (XPages is JSF with dynamic client side id creation)
		ffDriver.findElement(By.xpath("//*[substring(@id, string-length(@id) - 6) = ':panel1']")).click();
		
		//at this point the dialog box shows up and we want to click create general liquid
		UnpTasksPage tasksPage = new UnpTasksPage();
		ffDriver.findElement(By.xpath(tasksPage.getCreateGeneralLiquid())).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ffDriver.quit();
		
	}

}

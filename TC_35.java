package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_35 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']"));
		login.click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username.click();
		username.sendKeys("sreelekha.lekha@abc.com");
		
		WebElement pw = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		pw.click();
		pw.sendKeys("sreelekha123");
		
		WebElement enter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Login")));
		enter.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='tabBar']")));
		WebElement tab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='allTabsArrow']")));
		tab.click();
		Thread.sleep(1000);
		
		WebElement customize = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='customize']")));
		customize.click();

		WebElement selectTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Libraries')]")));
		selectTab.click();
		
		WebElement removebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@class,'leftArrowIcon')]")));
		removebutton.click();
		
		WebElement savebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")));
		savebutton.click();
		
		WebElement usermenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='userNavLabel']")));
		usermenu.click();
		WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
		logout.click();
		
		WebElement username1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username1.click();
		username1.sendKeys("sreelekha.lekha@abc.com");
		
		WebElement pw1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		pw1.click();
		pw1.sendKeys("sreelekha123");
		
		WebElement enter1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Login")));
		enter1.click();
		
	}

}

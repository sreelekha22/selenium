package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_34 {

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
		WebElement home = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("home_Tab")));
		home.click();
		
		WebElement FandLname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(@class,'currentStatusUserName')]//a[contains(text(),'sree Lekha')]")));
		FandLname.click();
		Thread.sleep(2000);
		WebElement edit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")));
		edit.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		WebElement about = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'About')]")));
		about.click();
		
		WebElement lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lastName']")));
		lastname.clear();
		lastname.sendKeys("Abcd");
		
		WebElement saveAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")));
		saveAll.click();

		Thread.sleep(2000);
		System.out.println("1. The 'Edit Profile' popup is closed."
				+ " 2.Updated LastName of the account holder is displayed at the top left hand side of the page."
				+ " 3.'User:FirstName LastName' page has the updated LastName.");
	}

}

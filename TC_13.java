package com.ta.salesForce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_13 {

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
		WebElement accounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Account_Tab")));
		accounts.click();
		
		WebElement merge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Merge Accounts')]")));
		merge.click();
		
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='srch']")));
		search.click();
		search.sendKeys("EF");
		WebElement find = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'srchbutton')]")));
		find.click();
		
		WebElement next = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'goNext')]")));
		next.click();
		
		WebElement MERGE = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")));
		MERGE.click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		alert.accept();
	}

}

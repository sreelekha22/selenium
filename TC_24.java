package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_24 {

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
		WebElement leads = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Lead_Tab")));
		leads.click();
		
		WebElement newview = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='new']")));
		newview.click();
		
		WebElement Lname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name_lastlea2']")));
		Lname.click();
		Lname.sendKeys("ABCDE");
		
		WebElement companyname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lea3']")));
		companyname.click();
		companyname.sendKeys("ABCDE");
		
		WebElement saveView = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")));
		saveView.click();
		Thread.sleep(2000);
	}

}

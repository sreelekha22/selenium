package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_37 {

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
		
		WebElement currentDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Friday August 14, 2020')]")));
		currentDate.click();
		
		WebElement fourpmLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='p:f:j_id25:j_id61:20:j_id64']")));
		fourpmLink.click();
		
		WebElement comboBox4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='evt5']")));
		comboBox4.click();
		comboBox4.sendKeys("Other");
		
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='EndDateTime_time']")));
		dropdown.click();
		WebElement select7 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='timePickerItem_38']")));
		select7.click();
		
		WebElement Recurrence = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='IsRecurrence']")));
		Recurrence.click();
		
		WebElement Weekly = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rectypeftw']")));
		Weekly.click();
		
		WebElement EndDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='RecurrenceEndDateOnly']")));
		EndDate.click();
		WebElement today = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'calToday')]")));
		today.click();
		
		WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")));
		save.click();
		
		WebElement month = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@class,'monthViewIconOn')]")));
		month.click();
		Thread.sleep(2000);
	}

}

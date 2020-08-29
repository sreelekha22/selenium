package com.ta.salesForce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_03 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']"));
		login.click();
		
		WebElement username = driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("sreelekha.lekha@abc.com");
		
		WebElement pw = driver.findElement(By.id("password"));
		pw.click();
		pw.sendKeys("sreelekha123");
		
		WebElement enter = driver.findElement(By.id("Login"));
		enter.click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		WebElement nav = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		nav.click();
		
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		
		WebElement remember = driver.findElement(By.id("rememberUn"));
		remember.click();
		
	}

}

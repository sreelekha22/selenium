package com.ta.salesForce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_04A {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/");
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']"));
		login.click();
		
		WebElement username = driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("sreelekha.lekha@abc.com");
		
		WebElement forgotpw = driver.findElement(By.id("forgot_password_link"));
		forgotpw.click();
		 
		WebElement usernameagain = driver.findElement(By.id("un"));
		usernameagain.click();
		usernameagain.sendKeys("sreelekha.lekha@abc.com");
		
		driver.findElement(By.id("continue")).click();
		
	}

}

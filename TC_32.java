package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_32 {

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
		WebElement contacts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Contact_Tab")));
		contacts.click();
		
		WebElement newContact = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='createNewButton']")));
		newContact.click();
		WebElement newContactselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'contactMru menuButtonMenuLink')]")));
		newContactselect.click();
		
		WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name_lastcon2']")));
		lastName.click();
		lastName.sendKeys("indian");
		
		WebElement accountName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='con4']")));
		accountName.click();
		accountName.clear();
		accountName.sendKeys("globalmedia");
		
		WebElement saveAndNew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")));
		saveAndNew.click();
		Thread.sleep(2000);
	}

}

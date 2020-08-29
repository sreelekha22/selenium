package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_07 {

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
		
		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='userNavLabel']")));
		menu.click();
		
		WebElement mysettings = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Settings')]")));
		mysettings.click();
		Thread.sleep(2000);
	
		WebElement personal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']")));
		personal.click();
		WebElement loginHistory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='LoginHistory_font']")));
		loginHistory.click();
		
		WebElement DisplayAndLayout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='DisplayAndLayout_font']")));
		DisplayAndLayout.click();
		
		WebElement CustomizeTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='CustomizeTabs_font']")));
		CustomizeTab.click();
		
		WebElement CustomApp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='p4']")));
		CustomApp.click();
		
		WebElement SFChatter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Salesforce Chatter')]")));
		SFChatter.click();
		
		WebElement addreport = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Reports')]")));
		addreport.click();
		
		WebElement addToList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='rightArrowIcon']")));
		addToList.click();
		
		WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='save']")));
		save.click();
		
		WebElement emailSetup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='EmailSetup']//a[contains(@class,'header setupFolder')]")));
		emailSetup.click();
		
		WebElement emailSettings = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='EmailSettings_font']")));
		emailSettings.click();
		
		WebElement emailname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sender_name']")));
		emailname.click();
		emailname.clear();
		emailname.sendKeys("sreelekha");
		
		WebElement emailaddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sender_email']")));
		emailaddress.click();
		emailaddress.clear();
		emailaddress.sendKeys("sreelekha.lekha@gmail.com");
		
		WebElement bcc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='auto_bcc1']")));
		bcc.click();
		
		WebElement saveemailsettings = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")));
		saveemailsettings.click();
		
		WebElement calender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='CalendarAndReminders']//a[contains(@class,'header setupFolder')]")));
		calender.click();
		
		WebElement ActivityReminder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='Reminders_font']")));
		ActivityReminder.click();
		
		WebElement testReminder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='testbtn']")));
		testReminder.click();
	}

}

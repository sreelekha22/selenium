package com.ta.salesForce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_16 {

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
		WebElement opportunity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Opportunity_Tab")));
		opportunity.click();
		
		WebElement NEWopportunity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='createNewButton']")));
		NEWopportunity.click();
		
		WebElement createopportunity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'opportunityMru menuButtonMenuLink')]")));
		createopportunity.click();
		
		WebElement opportunityName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='opp3']")));
		opportunityName.click();
		opportunityName.sendKeys("opportunity123");
		
		WebElement AccountName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='opp4']")));
		AccountName.click();
		AccountName.sendKeys("minnu");
		
		WebElement stage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='opp11']")));
		stage.click();
		
		WebElement closedate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='opp9']")));
		closedate.click();
		
		WebElement todayDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'calToday')]")));
		todayDate.click();
		
		WebElement stageOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Qualification')]")));
		stageOption.click();
		
		WebElement probability = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='opp12']")));
		probability.click();
		probability.clear();
		probability.sendKeys("20");
		
		WebElement leadSource = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='opp6']")));
		leadSource.click();
		
		WebElement leadSourceOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Purchased List')]")));
		leadSourceOption.click();
		
		WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")));
		saveButton.click();
	}
	/*
	public static void PopUp() {
		
		JavascriptExecutor jsx =(JavascriptExecutor)driver;
		jsx.executeScript("window.confirm('Alert dismiss in 5 sec');");
		try {
			Alert confirmation = driver.switchTo().alert();
			Thread.sleep(5000);
			confirmation.dismiss();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	*/
}

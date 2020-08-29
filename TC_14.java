package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_14 {

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
		
		WebElement accountReport = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
		accountReport.click();
		
		WebElement fromDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='ext-gen152']")));
		fromDate.click();
		Thread.sleep(2500);
		WebElement fromDateTodayButton = driver.findElement(By.xpath("//table[@id='ext-comp-1111']//tbody[@class='x-btn-small x-btn-icon-small-left']"));
		fromDateTodayButton.click();
		Thread.sleep(2000);
		
		WebElement toDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='ext-gen154']")));
		toDate.click();
		
		WebElement toDateTodayButton = driver.findElement(By.xpath("//table[@id='ext-comp-1113']//tbody[@class='x-btn-small x-btn-icon-small-left']"));
		toDateTodayButton.click();
		Thread.sleep(2000);
		
		WebElement saveReport = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='saveReportBtn']")));
		saveReport.click();
		
		WebElement reportName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		reportName.click();
		reportName.sendKeys("report1");
		
		WebElement uniqueName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='saveReportDlg_DeveloperName']")));
		uniqueName.click();
		
		WebElement finalSave = driver.findElement(By.xpath("//table[@id='dlgSaveReport']//tbody[@class='x-btn-small x-btn-icon-small-left']"));
		finalSave.click();
		Thread.sleep(2000);
	}

}

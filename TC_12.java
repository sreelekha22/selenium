package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_12 {

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
		
		WebElement editAcc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]")));
		editAcc.click();

		WebElement viewname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fname']")));
		viewname.click();
		viewname.clear();
		viewname.sendKeys("NEWVIEWNAME");
		
		WebElement filtersfield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='fcol1']")));
		filtersfield.click();
		
		WebElement accName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Name')]")));
		accName.click();
		
		WebElement operator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='fop1']")));
		operator.click();
		
		WebElement contain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='fop1']//option[contains(text(),'contains')]")));
		contain.click();
		
		WebElement value = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fval1']")));
		value.click();
		value.clear();
		value.sendKeys("a");
		
		WebElement saveview = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")));
		saveview.click();
		Thread.sleep(2000);
	}

}

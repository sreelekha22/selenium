package com.ta.salesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_06 {

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
		
		WebElement myprofile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Profile')]")));
		myprofile.click();
		Thread.sleep(2000);
		                      /*      GO TO EDIT --> ABOUT --> ENTER DETAILS --> SAVE    */
		
		WebElement edit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")));
		edit.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		WebElement about = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'About')]")));
		about.click();
		
		WebElement lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lastName']")));
		lastname.clear();
		lastname.sendKeys("Lekha");
		
		WebElement saveAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")));
		saveAll.click();
		
		 /*      POST      */
		
		WebElement post = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")));
		post.click();
		
		WebElement postbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='cke_39_contents']")));
		postbox.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")));
		Thread.sleep(2000);
		WebElement enterpost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[contains(@class,'chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]//p")));
		enterpost.sendKeys("Post keys here.");
		
		driver.switchTo().defaultContent();
		
		WebElement share = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='publishersharebutton']")));
		share.click();
		Thread.sleep(2500);
		
		/*     file upload   */
		
		WebElement file = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")));
		file.click();
		
		WebElement uploadbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chatterUploadFileAction")));
		uploadbutton.click();
		Thread.sleep(2000);
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		choosefile.sendKeys("C:\\Users\\dolby\\eclipse-workspace\\fileReading\\first.txt");
		Thread.sleep(2500);
		
		WebElement sharebtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='publishersharebutton']")));
		sharebtn.click();
		Thread.sleep(2000);
		
		/*       photo upload  */
		
		WebElement moderator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("displayBadge")));
		moderator.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")));
		Thread.sleep(1500);
		
		WebElement photolink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")));
		photolink.sendKeys("C:\\Users\\dolby\\Downloads\\micky.jpg");
		
		WebElement savepic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']")));
		savepic.click();
		
		WebElement savecroppic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='j_id0:j_id7:save']")));
		savecroppic.click();
		Thread.sleep(2500);
	}

}

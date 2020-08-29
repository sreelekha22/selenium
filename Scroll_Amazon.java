package com.sri.scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Amazon {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();

//		WebDriverWait wait = new WebDriverWait(driver,20);
//		WebElement AccountLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='nav-line-2 nav-long-width']")));
//		AccountLogin.click();
//		
//		WebElement UserName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_email']")));
//		UserName.click();
//		UserName.sendKeys("sreelekha.lekha@gmail.com");
//		
//		WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='continue']")));
//		continueButton.click();
//		
//		WebElement PassWord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_password']")));
//		PassWord.click();
//		PassWord.sendKeys("lalith123");
//		
//		WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInSubmit']")));
//		signIn.click();
//		Thread.sleep(30000);
		//WebElement countCards = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ol[@class='a-carousel']")));
//		for(int count=0; count< driver.findElements(By.xpath("//div[@id='desktop-banner'] ")).size();count++) {
//			System.out.println(count);
//			
//		}
		
		List<WebElement> listImage = driver.findElements(By.xpath("//div[@id='desktop-banner']//li"));
		
		System.out.println("No.of banners displayed. " + listImage.size());
		
		WebElement Element = driver.findElement(By.xpath("//span[contains(text(),\"Luke Bryan's outdoors essentials\")]"));
	
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    WebElement HorizontalScroll = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none feed-carousel hovering']//a[@class='a-link-normal feed-carousel-control feed-right']"));
	    HorizontalScroll.click();
	}

}

package com.sri.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollVerticalAndHorizoal {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.hotstar.com/us/");
		
		driver.manage().window().maximize();
		
		js.executeScript("window.scrollBy(0,2000)");// scroll by pixel
		
		Thread.sleep(1000);
		
		WebElement TargetElement = driver.findElement(By.xpath("//a[contains(text(),'Independence Day Special')]"));
			
		System.out.println(TargetElement.isDisplayed());
		
		Thread.sleep(1000);
		
		WebElement RightArrow = driver.findElement(By.xpath("//div[9]//div[1]//div[1]//div[1]//div[2]//i[1]"));
		RightArrow.click();
		
		Thread.sleep(1000);
		
		WebElement selectMovie = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='landing-page-container']/div[@class='master-container']/div[@class='master-container-inner']/div[@class='landing-page']/div[@class='tray-area']/div[@class='trays-container']/div[@class='trays']/div/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/article[1]/a[1]/div[2]"));
		selectMovie.click();
		Thread.sleep(3000);
		System.out.println("Movie Selected.");
	}

}

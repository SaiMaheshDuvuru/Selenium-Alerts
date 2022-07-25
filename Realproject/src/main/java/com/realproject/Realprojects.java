package com.realproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Realprojects {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		    Thread.sleep(3000);
		      driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		       Thread.sleep(3000);
		        driver.findElement(By.id("alertBox")).click();
		          Thread.sleep(3000);
		            System.out.println(driver.switchTo().alert().getText());
		             Thread.sleep(3000);
		              driver.switchTo().alert().accept();
		                Thread.sleep(3000);
		                 System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		                  Thread.sleep(3000);
		                 driver.findElement(By.id("confirmBox")).click();
		                Thread.sleep(3000);
		              System.out.println(driver.switchTo().alert().getText());
		              Thread.sleep(3000);
		             driver.switchTo().alert().accept();
		            Thread.sleep(3000);
		          System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		        Thread.sleep(3000);   
		      driver.findElement(By.id("promptBox")).click();
		     Thread.sleep(3000);
		   System.out.println(driver.switchTo().alert().getText());
		  Thread.sleep(3000);
         driver.switchTo().alert().sendKeys("Duvuru Sai Mahesh");
       Thread.sleep(3000);
       driver.switchTo().alert().accept();
	//  driver.quit();
		           

	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		  jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; backgroung;yellow;')", element);
		
	}

}
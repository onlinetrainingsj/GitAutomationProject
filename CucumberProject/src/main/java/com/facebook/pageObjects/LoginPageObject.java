package com.facebook.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {
	
	WebDriver driver;
	
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "F:\\javaWorkspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void enterUsername(){
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
	}
	
	public void enterPassword(){
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
	}
	
	public void clickLoginButton(){
		 driver.findElement(By.xpath("//*[@name='login']")).click();
	}
	
	public void verifyLogin(){
		System.out.println("Logged in successfully");
	}

}

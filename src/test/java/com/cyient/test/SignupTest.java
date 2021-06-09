package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class SignupTest extends WebDriverWrapper{
	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("abhi");
		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("upap");
		driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.findElement(By.xpath("//span[text()=' April ']")).click();
		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//span[text()=' 5 ']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2000");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
		
		driver.findElement(By.xpath("//span[text()=' India ']")).click();
		Thread.sleep(1000);
         
		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("abhbi008@gmail.com");
		driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
		driver.findElement(By.xpath("//span[text()=' What elementary school did you go to? ']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("govtschool");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='checkbox']/..")).click();
		
		driver.findElement(By.xpath("//button[text()=' Done ']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Royal Caribbean");
		
	}
	
	

}

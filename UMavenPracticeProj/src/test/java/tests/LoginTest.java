package tests;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static utilities.configReader.*;


public class LoginTest {
	@Test
	public void myLoginTest()throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get(getUrl());
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(getUsername());
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(getPassword());
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String title = driver.getTitle();
		System.out.println("Page Title: "+ title);
		Assert.assertEquals(title, "OrangeHRM");
		}

	

}

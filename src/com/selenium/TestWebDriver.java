package com.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "E:\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//连接url
		driver.navigate().to("http://localhost:8081/springmvc/user/list");
		
		//测试新增页面返回button
		driver.findElement(By.linkText("Add User Info")).click();
		driver.findElement(By.linkText("Go Back")).click();
		
		//测试新增数据
		driver.findElement(By.linkText("Add User Info")).click();
		driver.findElement(By.id("username")).sendKeys("testAdd");
		driver.findElement(By.id("password")).sendKeys("testAdd1");
		driver.findElement(By.id("nickname")).sendKeys("testAdd2");
		driver.findElement(By.id("email")).sendKeys("testAdd3");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// 放置一个隐式等待，等待10秒后再抛出
		WebElement input=driver.findElement(By.xpath("//input[@value='Submit']"));
		input.submit();
		
		//测试修改数据
		driver.findElements(By.linkText("Change")).get(0).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("testChange");
		driver.findElement(By.id("nickname")).clear();
		driver.findElement(By.id("nickname")).sendKeys("testChange2");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("testChange3");
		WebElement input2=driver.findElement(By.xpath("//input[@value='Submit']"));
		input2.submit();
		
		//测试删除数据
		driver.findElements(By.linkText("Delete")).get(0).click();  
		
		//关闭webDriver
		driver.close();
		
		//其他语法
		/*driver.manage().window().maximize();//浏览器全屏
		driver.findElements(By.xpath("//button[@title='Change']")).get(0).click();  
		driver.findElement(By.id("last")).sendKeys("78");
		driver.findElement(By.id("button")).click();
		driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
		String result = driver.findElement(By.id("last")).getText();
		driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
		System.out.println(" The Result is " + result);*/
	}
}


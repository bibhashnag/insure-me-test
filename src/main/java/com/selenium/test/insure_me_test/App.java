package com.selenium.test.insure_me_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 */
public class App {
    
public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
        
        driver.get("http://54.90.192.141:8081/contact.html");
        
        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
        WebElement textBox_name = driver.findElement(By.id("inputName"));
        textBox_name.sendKeys("Bibhash Nag");
        WebElement textBox_number = driver.findElement(By.id("inputNumber"));
        textBox_number.sendKeys("4445556666");
        WebElement textBox_email = driver.findElement(By.id("inputMail"));
        textBox_email.sendKeys("xyz@abc.com");
        WebElement textBox_message = driver.findElement(By.id("inputMessage"));
        textBox_message.sendKeys("Hello, the website is awesome.");
        WebElement submitButton = driver.findElement(By.id("my-button"));
        submitButton.click();
        
        WebElement response = driver.findElement(By.id("response"));
        response.getText();
        
        if(response.getText().equalsIgnoreCase("Message Sent")) {
        	System.out.println("Test Case Passed");
        }
        else
        {
        	System.out.println("Test Case Failed");
        }
        
		driver.quit();
	}
	
}

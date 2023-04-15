package edu.co;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class First1 {
	
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");  
	  //System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();  
		//ChromeOptions chromeOptions = new ChromeOptions();
		 //chromeOptions.addArguments("--remote-allow-origins=*");
		 //ChromeDriver driver = new ChromeDriver(chromeOptions); 
	      
	// Launch website  
	    driver.navigate().to("http://www.edureka.co/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();  
	    
	    
	    driver.close();
	      
	    }  
  }


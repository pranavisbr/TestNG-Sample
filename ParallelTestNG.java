package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestNG {
	
	;
  @Test
  public void google() {
	  
	  
		System.setProperty("webdriver.chrome.driver","D:\\TESTING DOCUMENTS\\chromedriver_win32\\chromedriver.exe"); //Mandatory
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		  d.get("https://www.google.com/");
		  d.close();
		  
}
@Test
public void amazon() {
	System.setProperty("webdriver.chrome.driver","D:\\TESTING DOCUMENTS\\chromedriver_win32\\chromedriver.exe"); //Mandatory
	WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		  d.get("https://www.amazon.in/");
		  d.close();
  }
}

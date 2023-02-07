package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Prog1TestNG {
	WebDriver d;
	WebElement w;
	  @BeforeSuite
	  public void beforeSuite() {
			System.setProperty("webdriver.chrome.driver","D:\\TESTING DOCUMENTS\\chromedriver_win32\\chromedriver.exe"); //Mandatory
			d=new ChromeDriver();
			d.manage().window().maximize();
	  }
		  
		  @BeforeTest
		  public void bt() {
			  d.get("https://www.amazon.in/");
		  }
		  @Test
		  public void f2(){
			w.sendKeys("mobiles");  
		  }
		  @Test
		  public void f() {
			  w=d.findElement(By.id("twotabsearchtextbox"));  
			 
		  }
		@AfterTest
		public void at() {
			System.out.println("autosuggest mobile data");
		}

	 @AfterSuite
	  public void afterSuite() throws InterruptedException {
		 Thread.sleep(2000);
		 d.close();
	  }

}
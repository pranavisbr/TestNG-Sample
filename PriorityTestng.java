package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PriorityTestng {
	WebDriver d;
	@BeforeSuite
	void bf_suite() {
		System.setProperty("webdriver.chrome.driver","D:\\TESTING DOCUMENTS\\chromedriver_win32\\chromedriver.exe"); //Mandatory
			d=new ChromeDriver();
			d.manage().window().maximize();
	}
@Test(priority =-1)
void open() {
	d.get("https://www.google.com/");
}
@Test(priority =-2)
void gmail() {
	d.findElement(By.linkText("Gmail")).click();
}
@Test(priority =0)
void rsignin() {
	 d.findElement(By.linkText("Sign in")).click();
}
@Test(priority =1)
void sendvalue() {
	d.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("Infomat");
}
}
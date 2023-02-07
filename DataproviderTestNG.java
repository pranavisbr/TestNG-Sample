package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTestNG {

	WebDriver d;
	String [][]data= {{"Admin","admin123"},
					  {"Admin1","admin123"},
					  {"Admin","admin1"},
					  {"Admin1","admin1"}};
	@DataProvider(name="Login")
	public String[][] dataprovider() {
		return data;
	}
	@Test (dataProvider ="Login")
public void datapro(String User,String pass) {
		System.setProperty("webdriver.chrome.driver","D:\\TESTING DOCUMENTS\\chromedriver_win32\\chromedriver.exe"); //Mandatory
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://opensource-demo.orangehrmlive.com/");
	WebElement UName=d.findElement(By.id("txtUsername"));
	UName.sendKeys(User);
	WebElement pwd=d.findElement(By.id("txtPassword"));
	pwd.sendKeys(pass);
	WebElement Login=d.findElement(By.id("btnLogin"));
	Login.click();
}
}
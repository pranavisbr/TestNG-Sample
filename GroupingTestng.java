package TestNG;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class GroupingTestng {
	WebDriver	d;
	WebElement w;
	 @BeforeSuite (groups= {"smoke"})
	  public void beforeSuite() {
			System.setProperty("webdriver.chrome.driver","D:\\TESTING DOCUMENTS\\chromedriver_win32\\chromedriver.exe"); //Mandatory
			 d=new ChromeDriver();
			 d.manage().window().maximize();
	  }
		@Test(groups= {"smoke"})
	    public void home() {
			d.get("https://www.amazon.in/");
			System.out.println("home");
		}
		@Test(groups= {"smoke"})
	    public void search() {
			w=d.findElement(By.id("twotabsearchtextbox"));
			System.out.println("search");
		}
		@Test(groups= {"smoke"})
	    public void search2() {
			w.sendKeys("Ganesha idol");
			System.out.println("search1");
			}
		@Test (groups= {"regression"})
		void search3()
		{
			d.findElement(By.id("nav-search-submit-button")).click();
			System.out.println("search2");
		}
	  @AfterSuite
	  public void afterSuite() {
		  d.close();
	  }

}
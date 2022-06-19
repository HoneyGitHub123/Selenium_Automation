package maventestproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class maventestlogin {
	WebDriver driver=null;
	
@BeforeTest
	
	public void login()
	{
	
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}

@Test
public void logintest1()
{
	
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]  ")).click();
	
	

}
@Test

public void logintest2() {


driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
}

@AfterTest
public void finishtest()
{
driver.close();
}}
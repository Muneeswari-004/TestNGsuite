package suite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter
{
	@Test
	@Parameters({"url","email","pwd"})
	public void positive(String url,String email,String pwd)
	{
		System.out.println(url);
		System.out.println(email);
		System.out.println(pwd);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();

		
		
		
	}

}

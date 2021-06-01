package testingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SimpleTest {

	@Test
	public void test(){
		WebDriver driver=null;
		String name=System.getProperty("browser");
		if(name.equals("firefox")){
		driver=new FirefoxDriver();
		}
		else{
			driver=new ChromeDriver();
		}
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("this is a test");
	driver.close();
	
	}
}

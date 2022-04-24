package sample1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class demo3 
{

	@Test
	public void s()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(("arguments[0].value='q',",'google'););
				
	}
	
}

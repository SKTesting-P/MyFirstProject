package sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
public static void main(String[] args)
{

	System.setProperty("webdriver.chrome.driver", 
			"D:\\New folder\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://housing.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,1800)","");
	
	String str1 = driver.findElement(By.xpath("//section[@data-q='featuredProjects']/header")).getText();
	System.out.println(str1);
	
	String str = driver.findElement(By.xpath("//div[@class='slide-element css-om3run']"
			+ "//*[@class='info css-poh5ib']//div[contains(text(),'by')]//parent::div/parent::div")).getText();
	System.out.println(str);
	
	List<WebElement> txt = driver.findElements(By.xpath("//section[@data-q='featuredProjects']/header |"
			+"//div[@class='slide-element css-om3run']//*[@class='info css-poh5ib']//div[contains(text(),'by')]//parent::div/parent::div"));
	System.out.println(txt.size());
	for(WebElement t:txt)
	{
		System.out.println(t.getText());
	}
	
	
	
	
}
}

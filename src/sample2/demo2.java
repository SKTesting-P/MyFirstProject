package sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo2
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"D:\\New folder\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://housing.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,1800)","");

	//List<WebElement> list = driver.findElements(By.xpath("//section[@data-q='featuredProjects']/header or "
	//   + "//div[@class='slide-element css-om3run']//*[@class='info css-poh5ib']/div/div[contains(text(),'Aadha')]/parent::div/parent::div"));
	
	
	List<WebElement> list = driver.findElements(By.xpath("//section[@data-q='featuredProjects']/header  |"
			+ " (//div[@class='slide-element css-om3run']//*[@class='info css-poh5ib']/div/div[contains(text(),'')]/parent::div/parent::div)[1]"));
	
	for(WebElement ls:list)
	{
		System.out.println(ls.getText());
	}
	}
}
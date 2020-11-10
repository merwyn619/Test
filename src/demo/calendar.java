package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merwynn\\Documents\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class = 'datepicker-switch']")).getText().contains("December"))
		{
			driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class = 'next']")).click();
		}
		List<WebElement> dates=driver.findElements(By.cssSelector(".day"));
		int count=driver.findElements(By.cssSelector(".day")).size();
		
		for (int i=0; i<count; i++)
		{
			String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("27"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				//System.out.println(text);
				break;
			}
		}
	}

}

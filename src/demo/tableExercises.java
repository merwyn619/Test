package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class tableExercises {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merwynn\\Documents\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29074/1st-test-pakistan-tour-of-england-2020");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount=table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
		for(int i=0;i<count-2;i++)
		{
			String value=table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInteger=Integer.parseInt(value);
			sum=sum+valueInteger;
		}
		//System.out.println(sum);
		String Extras=driver.findElement(By.xpath("//*[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int totalSumValue=sum+extrasValue;
		System.out.println(totalSumValue);
		String actualTotal=driver.findElement(By.xpath("//*[text()='Total']/following-sibling::div")).getText();
		int actualTotalValue=Integer.parseInt(actualTotal);
		if(actualTotalValue==totalSumValue)
		{
			System.out.println("Count Matches");
		}
		else
		{
			System.out.println("Count mismatch");
		}
		
	}

}

package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merwynn\\Documents\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@ value='Log In']")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());*/
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("Hello");
		driver.findElement(By.cssSelector("[type*='pass']")).sendKeys("45678");
		driver.findElement(By.cssSelector("#Login")).click();
	}

}

package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merwynn\\Documents\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.globalglaze.in/");
		driver.findElement(By.id("ctl00_ContentPlaceHolderusernm")).sendKeys("test123");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$adminpassword")).sendKeys("abc456");
		driver.findElement(By.linkText("Forgot Password")).click();	
	}

}

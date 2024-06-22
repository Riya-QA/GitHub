package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class github {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium\\Automation\\ruhiproject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name ='firstname']")).sendKeys("dhruti");
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("das");
		driver.findElement(By.cssSelector("[name='reg_email__']")).sendKeys("94374");
		driver.findElement(By.cssSelector("[data-type='password']")).sendKeys("abcd898");
		
	
	}
	
	
	
	
}

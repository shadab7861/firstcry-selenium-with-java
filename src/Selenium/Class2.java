package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shada\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/m/login");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@id='lemail']"));
		username.sendKeys("ahmadshadab1502@gmail.com");
		
		WebElement step = driver.findElement(By.xpath("WebElement step = driver.findElement(By.xpath(\"//input[@id='lemail']\"));"));
		step.click();
		WebElement pwd= driver.findElement(By.xpath("//input[@id='notp0']"));
		pwd.sendKeys("216793");
		WebElement login= driver.findElement(By.xpath("//span[normalize-space()='SUBMIT']"));
		login.click();
		Thread.sleep(2000);

	}

}

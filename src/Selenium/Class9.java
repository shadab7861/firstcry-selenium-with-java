package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shada\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String pw=driver.getWindowHandle();
		System.out.println(pw);
		WebElement insta = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		insta.click();
		Set<String> aw=driver.getWindowHandles();
		System.out.println(aw);
		
		
		for(String a:aw)
		{
			if(!(pw.equals(a)))
			{
				
				driver.switchTo().window(a);
			}
		}
		
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("Admin");
		

	}

}

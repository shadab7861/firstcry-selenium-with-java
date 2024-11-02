package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shada\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		WebElement pwd= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pwd.sendKeys("admin123");
		WebElement login= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\shada\\OneDrive\\Desktop\\Screeshot\\s1.png");
		FileUtils.copyFile(src, des);	
		login.click();
		Thread.sleep(5000);
		File src1= ts.getScreenshotAs(OutputType.FILE);
		File des1= new File("C:\\Users\\shada\\OneDrive\\Desktop\\Screeshot\\s2.png");
		FileUtils.copyFile(src1, des1);
		WebElement buzz= driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
		buzz.click();
		Thread.sleep(2000);
		WebElement post= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		post.sendKeys("shadab");
		File src2= ts.getScreenshotAs(OutputType.FILE);
		File des2= new File("C:\\Users\\shada\\OneDrive\\Desktop\\Screeshot\\s3.png");
		FileUtils.copyFile(src2, des2);
		WebElement post1= driver.findElement(By.xpath("//button[@type='submit']"));
		post1.click();
		Thread.sleep(2000);
		File src3= ts.getScreenshotAs(OutputType.FILE);
		File des3= new File("C:\\Users\\shada\\OneDrive\\Desktop\\Screeshot\\s4.png");
		FileUtils.copyFile(src3, des3);
	}

}

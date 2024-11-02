package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shada\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert1.click();
		Thread.sleep(2000);
		Alert a= driver.switchTo().alert();
		a.accept();
		WebElement okandcancel = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		okandcancel.click();
		Thread.sleep(2000);
		WebElement alert2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		alert2.click();
		driver.switchTo().alert();
		Thread.sleep(2000);
		a.dismiss();
		WebElement textbox = driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
		textbox.click();
		Thread.sleep(2000);
		WebElement alert3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		alert3.click();
		driver.switchTo().alert();
		a.sendKeys("shadab");
		Thread.sleep(2000);
		a.accept();
		
		
		

	}

}

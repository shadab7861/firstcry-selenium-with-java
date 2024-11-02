package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shada\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement f= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(f);
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		Actions a = new Actions (driver);
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		a.dragAndDrop(img1, trash).perform();
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		a.dragAndDrop(img2, trash).perform();
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		a.dragAndDrop(img3, trash).perform();
		Thread.sleep(2000);
		WebElement img4 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		a.dragAndDrop(img4, trash).perform();

	}

}

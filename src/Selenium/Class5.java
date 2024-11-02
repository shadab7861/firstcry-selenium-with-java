package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shada\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		Thread.sleep(5000);
		WebElement categories = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions a = new Actions (driver);
		a.moveToElement(categories).perform();
		WebElement softwaretesting = driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
		a.dragAndDrop(categories, softwaretesting).perform();
		WebElement automationtesting = driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']"));
		automationtesting.click();
	}

}

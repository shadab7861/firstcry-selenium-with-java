package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElemnet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shada\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		WebElement pwd= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pwd.sendKeys("admin123");
		WebElement login= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
		Thread.sleep(2000);
		WebElement buzz= driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
		buzz.click();
		Thread.sleep(2000);
		WebElement post= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		post.sendKeys("shadab");
		WebElement post1= driver.findElement(By.xpath("//button[@type='submit']"));
		post1.click();
	}

}
package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	// Global declarations for the webDriver interface
	public static String browser = "Chrome";
	public static WebDriver driver;

	// declarations end here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElementById("user-name").sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		// *[@id="login-button"] x-path of login button
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
	}

}

package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {

	// Global declarations for the webDriver interface
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// get method
		driver.get("https://www.saucedemo.com/");

		// findElement method​
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		// findElements methods -- and storing it into a List of ordered contents or
		// sequence
		List<WebElement> webelements = driver.findElements(By.xpath("//*[@class='inventory_list']/div"));
		System.out.println(webelements);

		// navigate()
		driver.navigate().to("https://www.sugarcrm.com");

		// getWindowhandle and getwindowHandles methods
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
		// Set is also a collection but with no duplicate elements
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		// manage method
		driver.manage().window().maximize();

		// getCurrentUrl()
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// getTitle()
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);

		// getPageSource()
		String currentPagesource = driver.getPageSource();
		System.out.println(currentPagesource);

		// quit() closes all the associated tabs and closes the webDriver
		driver.quit();

	}

}

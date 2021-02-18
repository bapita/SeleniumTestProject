package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithDropdowns {
	// Global declarations for the webDriver interface
	public static String browser = "Chrome";
	public static WebDriver driver;

	// declarations end here
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/marketing-automation/");
		driver.manage().window().maximize();

		// Models a Select tag, by providing helper methods to select and de-select options

		WebElement wb = driver.findElement(By.name("employees_c"));
		// Constructor Select(WebElement element)
		Select select = new Select(wb);
		select.selectByValue("level1");
		Thread.sleep(2000); // to add wait in the process
		select.selectByVisibleText("51-100 employees");
		Thread.sleep(2000); // to add wait in the process
		select.selectByIndex(5);
		Thread.sleep(2000); // to add wait in the process
		// driver.close();
	}

}

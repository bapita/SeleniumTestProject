package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {
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

		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println("total no. of links are: "+all_links.size());
		
		for(int i=0;i<all_links.size();i++) {
			System.out.println("Link is: "+all_links.get(i).getAttribute("href"));
			System.out.println("The text is: "+all_links.get(i).getText());
		}

		// driver.close();
	}

}

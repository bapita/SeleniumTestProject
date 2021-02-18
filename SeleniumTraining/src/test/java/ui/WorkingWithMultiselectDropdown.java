package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithMultiselectDropdown {
	// Global declarations for the webDriver interface
	public static String browser = "Chrome";
	public static WebDriver driver;

	// declarations end here
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();

		// Models a Select tag, by providing helper methods to select and de-select
		// options
		WebElement dd = driver.findElement(By.id("multi-select"));
		Select select = new Select(dd);
		select.selectByValue("California");
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByVisibleText("New York");
		Thread.sleep(2000);

		// taking all the items in the list of webElements
		List<WebElement> all_selected_items = select.getAllSelectedOptions();
		System.out.println(all_selected_items.size());

		// to get the first item selected
		WebElement first_selected = select.getFirstSelectedOption();
		System.out.println(first_selected.getText());
		// to deselect all the items
		select.deselectAll();

		// driver.close();
	}

}

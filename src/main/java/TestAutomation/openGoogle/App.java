package TestAutomation.openGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");

		// Navigate to http://www.google.com
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.codingbook.org");

		// Enter the key "Hello World" to search field
		WebElement q = driver.findElement(By.xpath("//input[@name = 'q']"));
		q.sendKeys("Hello World");
	}
}

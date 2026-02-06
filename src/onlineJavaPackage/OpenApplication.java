package onlineJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {

		// Set property of chrome browser and pass chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abcom\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Launch chrome browser instance
		WebDriver driver = new ChromeDriver();

		// Open Url using get() method
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");

		// Maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();

		// Open url using navigate() method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");

		// Refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();

		// Navigate back
		Thread.sleep(2000);
		driver.navigate().back();

		// Navigate forward
		Thread.sleep(2000);
		driver.navigate().forward();

		// Fetch the current URL
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

		// Fetchthe title of webpage
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		// Close the browser instance
		Thread.sleep(2000);
		driver.close();
	}
}

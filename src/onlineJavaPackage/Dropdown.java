package onlineJavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String args[]) throws InterruptedException

	{
		System.setProperty("webdriver.chromedriver",
				"C:\\Users\\Abcom\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		//1st way
		Thread.sleep(2000);
		driver.findElement(By.id("Month")).sendKeys("Mar");
		
		//2nd way
		
		List<WebElement> birthmonth= driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		System.out.println("Total dropdown values:" +birthmonth.size());
		birthmonth.get(3).click();
		Thread.sleep(2000);
		birthmonth.get(8).click();
		

	}
}
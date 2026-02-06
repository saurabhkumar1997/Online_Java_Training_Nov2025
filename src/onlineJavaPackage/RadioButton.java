package onlineJavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String args[])

	{
		System.setProperty("webdriver.chromedriver",
				"C:\\Users\\Abcom\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		//driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();


		// Appropriate way
		List<WebElement> radios = driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
		System.out.println("Total no of button=" + radios.size());

		String expresult = "Custom";
		

		for (int i = 0; i < radios.size(); i++) {

			if (radios.get(i).getText().equalsIgnoreCase(expresult))

			{
				radios.get(i).click();
				System.out.println(expresult + " clicked");
			}
		}

		//driver.close();
	}

}

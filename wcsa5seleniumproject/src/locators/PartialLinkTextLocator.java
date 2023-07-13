package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		

	}

}

//driver.get("http://omayo.blogspot.com/");
//driver.manage().window().maximize();

//driver.findElement(By.partialLinkText("Open a popup window")).click();


package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("http://127.0.0.1:80/");
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("12345");
		 driver.findElement(By.tagName("submit")).click();
	}

}

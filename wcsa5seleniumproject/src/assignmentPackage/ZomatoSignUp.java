package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.zomato.com/india");
		 
		 
		 //to click on sign up link
		 driver.findElement(By.linkText("Sign up")).click();
		 
	}

}

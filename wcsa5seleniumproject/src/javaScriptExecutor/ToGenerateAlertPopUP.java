package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateAlertPopUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the web application
		driver.get("file:///C:/Users/New/Desktop/wcsa5/DisabledWebElement.html");
		
		//identify webelement
		driver.findElement(By.id("i1")).sendKeys("admin");
		//driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		//To generate alert pop up
		jse.executeScript("alert('Hello There!!');");
		Thread.sleep(2000);
		//To generate alert pop up
		driver.switchTo().alert().accept();
		
		//To handle Disabled webelement
		jse.executeScript("document.getElementById('i2').value='manager'");
		


	}

}

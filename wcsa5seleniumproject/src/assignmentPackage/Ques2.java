package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {

	public static void main(String[] args) throws InterruptedException {
		//How to close all the browsers without quit()?
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the webapplication
		driver.get("http://omayo.blogspot.com/");
		
		//launch the child window
		Thread.sleep(2000);
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		
		Point elementLoc = childWindow.getLocation();
		int xaxis = elementLoc.getX();
		int yaxis = elementLoc.getY();
		
		//scroll till open a pop up window link
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		 
		 //click on link to open child browser
		 childWindow.click();
		 //close all the browsers without using quit()
		 Thread.sleep(2000);
		 //driver.quit();
		 
		 //get the address or handle of parent and child window
		 Set<String> allHandles = driver.getWindowHandles();
		 
		 //close the browser by reading address of each window or browser
		 for(String wh:allHandles)
		 {
			 //switch the control to each browser by using switchTo()
			 Thread.sleep(2000);
			 driver.switchTo().window(wh).close();
		 }


	}

}

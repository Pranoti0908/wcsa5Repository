package testNGPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() throws InterruptedException, AWTException
  {
	 // System.out.println("This is Demo TestNG Class"); 
	  
	 // Reporter.log("This is Demo TestNG Class!!"); //log(String s)
	  
	
	     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.google.com");
		 driver.switchTo().activeElement().sendKeys("Java");
		 
		
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(2000);
		 driver.quit();
		 
	    Reporter.log("This is Demo TestNG Class!!",true);
	 
  }
}


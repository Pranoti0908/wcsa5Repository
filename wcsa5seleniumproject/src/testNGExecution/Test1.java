package testNGExecution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void testMethod1() throws InterruptedException, AWTException 
  {
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
		 
	    Reporter.log("This is Demo TestNG method1!!",true);
  }
}

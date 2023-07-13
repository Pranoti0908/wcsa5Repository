package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginCSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name*='use']")).sendKeys("Panda");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("Panda@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='acap']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class*='ab3']")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("a[class*='x1i10hfl']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='ail']")).sendKeys("Chaitya@123");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder*='word']")).sendKeys("Max@100");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id*='loginbutton']")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("a[class*='7w']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class*='signup_btn']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='firstname']")).sendKeys("Virat");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='lastname']")).sendKeys("Kohli");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='0_g_']")).sendKeys("1234567890");
				
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='passwd_']")).sendKeys("rutu@20");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name*='day']")).sendKeys("09");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name*='month']")).sendKeys("Aug");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name*='year']")).sendKeys("2001");
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='0_4']"));
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='0_5']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='0_6']"));
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name*='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class*='bq5']")).click();
		
		
		
		
		
		
		

	}

}

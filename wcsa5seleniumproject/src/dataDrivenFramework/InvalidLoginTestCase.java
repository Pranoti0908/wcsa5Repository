package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:80/");
		
		//read the data from excel file and test the login page
		Flib flib = new Flib();
		
		//to read multiple data using for loop
		int rc = flib.getLastRowCount("./Data/ActiTime.xlsx", "invalidcreds");
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./Data/ActiTime.xlsx", "invalidcreds", 1, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./Data/ActiTime.xlsx", "invalidcreds", 1, 1));
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}

	}

}

package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 
{
	//It is used to disable or enable the methods/TestCase
	  @Test(description = "Login Method!!",enabled = true)
	  public void method1()
	  {
		  Reporter.log("Method1 from Flag2",true);
	  }
	  
	  @Test(description = "Logout Method!!",enabled = true)
	  public void method2()
	  {
		  Reporter.log("Method2 from Flag2",true);
	  }
}

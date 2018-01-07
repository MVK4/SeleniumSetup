package testcases;
/////////
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Initial2ClassSetup {

	@Test
	public void testcase1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.udemy.com");
	/////
	//driver.findElementById("email").sendKeys("Vinod");
	Thread.sleep(2000);
	
	//driver.findElementById("pass").sendKeys("Mamidi");
	driver.quit();
}
}

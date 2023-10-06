package Jenkinsmvnintegration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sampletestcase {

	public class GoogleSearchTest {
		private WebDriver driver;

		@BeforeTest
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kulsherastchauhan\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
		}

		@Test
		public void testGoogleSearch() {
			driver.get("https://www.google.com/");
			String pageTitle = driver.getTitle();
			System.out.println("Page Title: " + pageTitle);
		}

		@AfterTest
		public void tearDown() {
			if (driver != null) {
				driver.quit();
			}
		}
	}
}
/*public class Sampletestcase {
	 public static void main(String args[])
	    {
	//private WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	// Instantiate a ChromeDriver class.
	WebDriver driver = new ChromeDriver();

	// Maximize the browser
	driver.manage().window().maximize();

	// Launch Website
	driver.get("https://www.geeksforgeeks.org/");

}
}*/

package Com.HomeJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	static WebDriver driver;
    public String browser = "Chrome";
	
	public BasePage() {
		if(driver == null) {
			
			if(browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "F:\\sel\\chromedriver_win32 (2)\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equals("firebox")) {
				System.setProperty("webdriver.gecko.driver", "F:\\sel\\geckodriver-v0.23.0-win32\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	
	
}

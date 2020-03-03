package CommonUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	public static ChromeDriver driver;

	public static ChromeDriver LaunchBrowser() throws IOException {

		if (BrowserFactory.driver == null) {
			System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(ReusableFunc.getValue("url"));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}
		return driver;
	}

}
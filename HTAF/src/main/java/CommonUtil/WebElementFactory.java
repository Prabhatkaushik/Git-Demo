package CommonUtil;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class WebElementFactory {

	public static WebElement getElement(String strXpath) throws IOException {
		return BrowserFactory.LaunchBrowser().findElement(By.xpath(strXpath));

	}

	public static void setData(WebElement we, String arrData) {
		we.clear();
		we.sendKeys(arrData);
		Reporter.log("Setting Data -" + arrData);
	}

	public static void clickElement(WebElement we) {
		we.click();
		
		String str = we.toString();
		String[] arrStr = str.split("->");
		Reporter.log("Clicking Element -" + arrStr[1]);
	}
}

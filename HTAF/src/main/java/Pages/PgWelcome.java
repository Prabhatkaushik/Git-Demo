package Pages;

import static CommonUtil.WebElementFactory.*;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CommonUtil.BrowserFactory;

public class PgWelcome {
	
	String locBtnWelcome = "//a[@id='btnLogin']";
	String locBtnLogout = "//a[text()='Logout']";

	// creating objects
	public WebElement btnWelcome() throws IOException {
				return getElement(locBtnWelcome);
	}
	public WebElement btnLogout() throws IOException {
		return getElement(locBtnLogout);
}

	public void clickWelcome() throws IOException 
	{
		clickElement(btnWelcome());
	}
	
	public void clickLogout() throws IOException 
	{
		clickElement(btnLogout());	
	}
	
}

package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import static CommonUtil.WebElementFactory.*;

public class PgLogin {

	// setting locations for easy debugging
	String locTxtUsername = "//input[@id='txtUsername']";
	String locTxtPassword = "//input[@id='txtPassword']";
	String locBtnLogin = "//input[@id='btnLogin']";

	// creating objects
	public WebElement txtUsername() throws IOException {
		return getElement(locTxtUsername);

	}

	public WebElement txtPassword() throws IOException {
		return getElement(locTxtPassword);

	}

	public WebElement btnLogin() throws IOException {
		return getElement(locBtnLogin);
	}

	public void setUsername(String arrData) throws IOException {
		setData(txtUsername(), arrData);
	}

	public void setPassword(String arrData) throws IOException {
		setData(txtPassword(), arrData);

	}

	public void clickLogin() throws IOException {
		clickElement(btnLogin());
	}
}

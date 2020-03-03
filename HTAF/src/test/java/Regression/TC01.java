package Regression;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import CommonUtil.BrowserFactory;
import Pages.PgLogin;
import Pages.PgWelcome;

public class TC01 {

 	@Test(dataProvider = "testData")
	public void Login_01(String UserName,String Password, String arrData) throws IOException {
		 
	PgLogin pgLogin = new PgLogin();
	PgWelcome pgWelcome = new PgWelcome();
	
	pgLogin.setUsername(UserName);
	Reporter.log("Setting user name");
//	pgLogin.setPassword(Password);
//	Reporter.log("Setting Password");
//	pgLogin.clickLogin();
//	Reporter.log("Clicking login");
	
	pgWelcome.clickWelcome();
	Reporter.log("Clicking Welcome");
	pgWelcome.clickLogout();
	Reporter.log("Clicking Logout");
	
	}
	
 	@DataProvider
	public Object[][] testData() throws IOException
	{
		String path = "src\\test\\resources\\testData.xlsx";
		
	XSSFWorkbook objWB = new XSSFWorkbook(path);
	XSSFSheet objWS = objWB.getSheet("Login");
	 
	System.out.println(objWS.getLastRowNum());
	int iRowCount = objWS.getLastRowNum();
	int iColCount = objWS.getRow(0).getLastCellNum();
	
	String [][] arrData = new String [iRowCount][iColCount];
	
	for(int iRow =0;iRow>=iRowCount-1;iRow++) 
	{
		XSSFRow row = objWS.getRow(iRow+1);
		for(int iCol=0;iCol<=iColCount-1;iCol++) 
		{
			XSSFCell cell = row.getCell(iCol);
			
			arrData [iRow][iCol] = cell.getStringCellValue();
		}
	}
	
	return arrData;	
	}
}


package NewUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



	
public class UtilityNew {
	public static WebDriver driver;
	JavascriptExecutor js;
	FileInputStream obj;
	XSSFWorkbook book;
	XSSFSheet objsheet;
	XSSFRow row;
	XSSFCell cell;

	public WebDriver web(String url,String browser)
	{
		switch(browser.toLowerCase()) {
		/////////////url////////////////////////
		
		case "ie":
			      System.setProperty("webdriver.ie.driver","C:\\Users\\sasis\\Desktop\\Selenium\\IEDriverServer.exe");
			      driver = new InternetExplorerDriver();
		          driver.manage().window().maximize();//fullscreen
		          driver.get(url);	
		         
		       
	case "chrome":
		          System.setProperty("webdriver.chrome.driver","C:\\Users\\sasis\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		          driver=new ChromeDriver();		        
		          driver.manage().window().maximize();//fullscreen
		          driver.get(url);	
		        //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		          
		         
	}
		return driver;
		
	}

	public String ReadExcel1(int r, int c) throws IOException {
		String Value = "";
		obj = new FileInputStream("C:\\Users\\sasis\\Desktop\\Selenium\\Book1Project.xlsx");
		book = new XSSFWorkbook(obj);
		objsheet = book.getSheet("Sheet1");
		row = objsheet.getRow(r);
	cell = row.getCell(c);
		CellType type = cell.getCellType();
		if (type == CellType.NUMERIC) {
			double Value1 = cell.getNumericCellValue();
			String str = String.valueOf(Value1);
			return str;
		} else if (type == CellType.STRING) {
			Value = cell.getStringCellValue();
		}
		return Value;
	}

	///////////////////////////handlesleep//////////////////////////getCellType();
	public static void handleSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}
	//////////////////////////////////click///////////////////////////
	public void click(By property)
	{
	driver.findElement(property).click();
		
	}
	//////////////////sendkeys////////////////////////////////////
	public void sendkeys(By property,String value)
	{
		driver.findElement(property).sendKeys(value);
	}
	///////////////////wait//////////////////////////////
	public void implicitywait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	////////////////////navigation///////////////////////////
	public WebDriver Navigate(String url) {
		driver.navigate().to(url);
		driver.navigate().forward();
		driver.navigate().back();
		return driver;
	}

	//////////////////////screenshot///////////////////////////////////
	public void takescreenshot()
	{
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(src,new File("C:\\Users\\sasis\\Desktop\\Screenshot"));
			 
		 FileUtils.copyFile(src, new File("C:\\Users\\sasis\\Desktop\\Screenshot"+System.currentTimeMillis()+".png"));

		}
	catch(Exception e) {
	}
	}
	////////////////////////////scroll up/////////////////////////
	
	public void scrollup(int a, int b) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(a,b)");
	}
	////////////////////////////scroll down////////////////////////////
	
	public void scrolldown(int a, int b) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(a,b)");
	}

}







import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import NewUtility.UtilityNew;

public class One {
	UtilityNew objutilitynew;
	static  WebDriver driver1 ;
	SoftAssert softAssert = new SoftAssert();
	UtilityNew read=new UtilityNew();
	
	 @Test(priority = 0,enabled=true)
		public void LoginPage1() throws InterruptedException, IOException {
	
	WebElement Username = driver1.findElement(By.id("loginform-username"));
		
		Username.sendKeys(read.ReadExcel1(0, 0));
		WebElement Password = driver1.findElement(By.id("loginform-password"));
			Password.sendKeys(read.ReadExcel1(1, 0));
		UtilityNew.handleSleep(6000);
			WebElement Login = driver1.findElement(By.xpath("//*[@name='login-button']"));
		Login.click();
			UtilityNew.handleSleep(6000);
		}
 
  
 
 
 @Test(priority=1,enabled=true)
 public void AttendencePage() throws InterruptedException {///////success/////
	 Thread.sleep(4000);
	 WebElement Jobs = driver1.findElement(By.xpath("//*[@title='Jobs']")); 
		Jobs.click();
		Thread.sleep(3000);
		WebElement Attendance1 = driver1.findElement(By.xpath("//*[@href='/erp/attendances']"));
		Attendance1.click();
		Thread.sleep(3000);
		WebElement Calendar = driver1.findElement(By.xpath("//*[@title='Select date']"));
		Calendar.click();
		Thread.sleep(3000);
		WebElement Date = driver1.findElement(By.xpath("//*[@data-date='1597017600000']"));
		Date.click();
		Thread.sleep(4000);
		WebElement startbutton = driver1.findElement(By.xpath("//*[@type='submit']"));
		startbutton.click();
 }
 
 @Test(priority=2,enabled=true)
 public void CreateAttendence() throws InterruptedException {
		
		Thread.sleep(4000);
		WebElement CreateAttendance = driver1.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span"));
		CreateAttendance.click();
		Thread.sleep(4000);
		WebElement Calendarcreate = driver1.findElement(By.xpath("//*[@id=\"attendance-date-kvdate\"]/span[1]/i"));
		Calendarcreate.click();
		Thread.sleep(3000);
		WebElement DateCreate = driver1.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[2]"));
		DateCreate.click();
		Thread.sleep(4000);
		WebElement createbutton = driver1.findElement(By.xpath("//*[@type='submit']"));
		createbutton.click();
	
 }
 
 @Test(priority=3,enabled=false)
 public void Leave() throws InterruptedException, AWTException {
	 
	 Thread.sleep(1000);
	 WebElement leave = driver1.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a/i"));
	 leave.click();
	 
		Thread.sleep(2000);
		WebElement calenderleave = driver1.findElement(By.xpath("//*[@id=\"leaveform-date_range-container\"]/div/input"));
	    calenderleave.click();
		 
		Thread.sleep(3000);
		 WebElement dateleave2 = driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[5]"));
		 dateleave2.click();
		 
		Thread.sleep(3000);
		 WebElement dateleave1 = driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[6]"));
		dateleave1.click(); 
		 Thread.sleep(3000);
		 WebElement  applybutton= driver1.findElement(By.xpath("/html/body/div[2]/div[4]/button[2]"));
		 applybutton.click();  
		Thread.sleep(3000);
	
	
		 WebElement worker = driver1.findElement(By.xpath("//*[@id=\"select2-leaveform-worker-container\"]"));
		 worker.click();
		 WebElement workername = driver1.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		 workername.sendKeys("Sagar Alias Jacky");
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(4000); 
		 
		 
		 WebElement  reason= driver1.findElement(By.xpath("//*[@id=\"leaveform-reason\"]"));
		 reason.sendKeys("Family Function");
		 
 }
 @Test(priority=4,enabled=false)
 public void holiday() throws InterruptedException {//////success/////////////
	
	 Thread.sleep(3000);
	 WebElement  holiday= driver1.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a/i"));
	 holiday.click();
	 Thread.sleep(3000);
	 WebElement  createholidaybutton= driver1.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/p/a"));
	 createholidaybutton.click(); 
	 WebElement  calenderholiday= driver1.findElement(By.xpath(" //*[@id=\"holiday-date-kvdate\"]/span[1]/i"));
	 calenderholiday.click();
	 WebElement  dateholiday= driver1.findElement(By.xpath(" /html/body/div[2]/div[1]/table/tbody/tr[4]/td[1]"));
	 dateholiday.click();
	 WebElement titleholiday  = driver1.findElement(By.xpath("//*[@id=\"holiday-title\"]"));
	 titleholiday.sendKeys("Sunday");
	 WebElement  branch= driver1.findElement(By.xpath("//*[@id=\"holiday-branch_id\"]"));
	 branch.click();
	 WebElement  branchvalue= driver1.findElement(By.xpath("//*[@id=\"holiday-branch_id\"]/option[4]"));
	 branchvalue.click();
	 WebElement descriptionholiday  = driver1.findElement(By.xpath("	//*[@id=\"holiday-description\"]"));
	 descriptionholiday.sendKeys("Public holiday");
	 Thread.sleep(1000);
	 WebElement statusholiday  = driver1.findElement(By.xpath("//*[@id=\"holiday-status\"]"));
	 statusholiday.click();
	 boolean statusholidayEnabled = driver1.findElement(By.id("holiday-status")).isEnabled();

      if (statusholidayEnabled==true )
      {
           
      	System.out.println("not enabled");//checkbox not enabled so click action done
             WebElement checkbox1 = driver1.findElement(By.id("holiday-status"));
             checkbox1.click();
      }
	 WebElement savebutton= driver1.findElement(By.xpath("//*[@id=\"w0\"]/div[15]/div/button"));
	 savebutton.click();
	 Thread.sleep(1000);
	 WebElement update= driver1.findElement(By.xpath("//*[@class='btn btn-primary']"));
	 update.click();
	 Thread.sleep(1000);
	 WebElement descriptionholidayupdate  = driver1.findElement(By.xpath("//*[@id='holiday-description']"));
	 descriptionholidayupdate.sendKeys("Sunday is a holiday");
	 Thread.sleep(1000);
	 WebElement savebuttonupdate= driver1.findElement(By.xpath("//*[@id=\"w0\"]/div[15]/div/button"));
	 savebuttonupdate.click();
	 Thread.sleep(1000);
	 WebElement deletebutton= driver1.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/p/a[2]"));
	 deletebutton.click();
	 Alert al=driver1.switchTo().alert();
	 al.dismiss();
	 Thread.sleep(3000);
	 //objutilitynew.takescreenshot();
	 driver1.navigate().back();
	 
 }
 @Test(priority=5,enabled=false)
 public void report() throws InterruptedException {//////successs
	
	 Thread.sleep(4000);
	WebElement report = driver1.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a/span"));
	report.click();	 
	Thread.sleep(4000);
    WebElement calenderreport = driver1.findElement(By.xpath("//*[@id=\"attendanceform-date-kvdate\"]/span[1]/i"));
	calenderreport.click();	 
	Thread.sleep(4000);
	WebElement monthreport = driver1.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[5]"));
	monthreport.click();
	Thread.sleep(4000);
	WebElement findbutton = driver1.findElement(By.xpath("//*[@class='btn btn-success']"));
	findbutton.click();
	Thread.sleep(4000);

 }

 @Test(priority=6,enabled=false)
 public void payroll() throws InterruptedException {///////success
	
	 Thread.sleep(4000);
		WebElement payroll = driver1.findElement(By.xpath(" /html/body/div/aside/section/ul/li[7]/a/span "));
		payroll.click(); 
		 Thread.sleep(4000);
			WebElement calenderpayroll = driver1.findElement(By.xpath("//*[@id=\"payrollform-date-kvdate\"]/span[1]/i"));
			calenderpayroll.click(); 
			Thread.sleep(4000);
			WebElement monthpayroll = driver1.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[7]"));
			monthpayroll.click(); 
			Thread.sleep(4000);
			WebElement findpayrollbutton = driver1.findElement(By.xpath("//*[@id=\"w0\"]/div[2]/div/button"));
			findpayrollbutton.click(); 
			Thread.sleep(4000);
			WebElement viewpayroll = driver1.findElement(By.xpath("//*[@id=\"w5-container\"]/table/tbody/tr[1]/td[12]/a[1]/span"));
			viewpayroll.click();			
			Thread.sleep(4000);
			WebElement updatebuttonviewpayroll = driver1.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/p/a[1]"));
			updatebuttonviewpayroll.click();
			Thread.sleep(4000);
			WebElement saveupdatebutton = driver1.findElement(By.xpath("//*[@id=\"w0\"]/div[24]/button"));
			saveupdatebutton.click();
			
 }
 
 @Test(priority =7,enabled=false)
	public void area() throws InterruptedException{////successs
	 Thread.sleep(4000);
	 WebElement Jobs = driver1.findElement(By.xpath("//*[@title='Jobs']")); 
		Jobs.click();
		Thread.sleep(3000);
		WebElement Attendance1 = driver1.findElement(By.xpath("//*[@href='/erp/attendances']"));
		Attendance1.click();
	 Thread.sleep(4000);
	 WebElement area = driver1.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/a/span"));
		area.click();
		 Thread.sleep(4000);
		WebElement createareabutton = driver1.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/p/a"));
		createareabutton.click();
		
			WebElement namearea = driver1.findElement(By.xpath("//*[@id=\"area-name\"]"));
			namearea.sendKeys("Krishna");
			Thread.sleep(4000);
			WebElement descriptioncreatearea = driver1.findElement(By.xpath("//*[@id=\"area-description\"]"));
			descriptioncreatearea.sendKeys("Testing Engineer");
			Thread.sleep(4000);
			WebElement savebuttonarea = driver1.findElement(By.xpath("//*[@id=\"w0\"]/div[3]/button"));
			savebuttonarea.click();
		     Thread.sleep(4000);
			WebElement areaupdatebutton = driver1.findElement(By.xpath(" /html/body/div/div/section[2]/div[1]/p/a"));
			areaupdatebutton.click();
			 Thread.sleep(4000);
			WebElement descriptionupdatearea = driver1.findElement(By.xpath("//*[@id=\"area-description\"]"));
			descriptionupdatearea.sendKeys("aabbcc");
			 Thread.sleep(4000);
		    WebElement saveareaagain = driver1.findElement(By.xpath(" //*[@id=\"w0\"]/div[3]/button"));
			saveareaagain.click();
 }


 @Test(priority =8,enabled=false)/////////create jobpage success/////////////////
	public void CreateJobsPage() throws InterruptedException, AWTException {
	 Thread.sleep(4000);
	
	    Thread.sleep(4000);
		WebElement Jobspage = driver1.findElement(By.xpath("//*[@title='Jobs']"));
		Jobspage.click();
		Thread.sleep(4000);
		WebElement Jobs = driver1.findElement(By.xpath("//*[@href='/erp/jobs']"));
		Jobs.click();
		Thread.sleep(4000);
		WebElement CreateJobbutton = driver1.findElement(By.xpath("//*[@href='/erp/job/create']"));
		CreateJobbutton.click();
		Thread.sleep(4000);
		
		WebElement jobTitle = driver1.findElement(By.xpath("//*[@id=\"job-title\"]"));
		jobTitle.sendKeys("Software  Engineer in testing");
		
		Thread.sleep(7000);
		WebElement client=driver1.findElement(By.xpath("//span[@id='select2-job-client_id-container']"));
		client.click();
		
		Thread.sleep(2000);		
		WebElement cl=driver1.findElement(By.xpath("//li[@class='select2-results__option']"));
		cl.click();
		
		Thread.sleep(4000);
		WebElement po=driver1.findElement(By.xpath("//input[@id='job-po']"));
		po.click();
		po.sendKeys("Sample");
		
		Thread.sleep(2000);
		WebElement description =driver1.findElement(By.xpath("//textarea[@id='job-description']"));
		description.click();
		description.sendKeys("Testing and Validation");
		
		Thread.sleep(2000);
		WebElement jobType=driver1.findElement(By.xpath("//select[@id='job-type']"));
		Select type=new Select(jobType);
		type.selectByIndex(1);
		
		Thread.sleep(2000);
		WebElement saveButton=driver1.findElement(By.xpath("//button[@class='btn btn-success']"));
		saveButton.click();
		  
		 Thread.sleep(3000);
		 //objutilitynew.takescreenshot();
		 driver1.navigate().back();
	
	}
 @Test(priority = 9,enabled=true)
 public void LogoutPage() throws InterruptedException, AWTException {
		WebElement Profile = driver1.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[8]/a"));
		Profile.click();
		WebElement Logout = driver1.findElement(By.xpath("//*[@class='logout-btn']"));
		Logout.click();
	}

 
 @BeforeTest
 public void beforeTest() {
	  UtilityNew objutilitynew=new UtilityNew();
	  driver1= objutilitynew.web("https://qabible.in/erp/","chrome");
 }

 @AfterTest
 public void afterTest() throws InterruptedException {
	  Thread.sleep(9000);
		 driver1.quit(); 
 }

}
package testpkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.OpenCartBillingDetails;
import pagepkg.OpenCartLogout;
import pagepkg.OpencartHomepg;
//import pagepkg.OpencartLoginpage;
import pagepkg.OpencartLoginpg;

public class opencarttest {
	
	WebDriver driver;
    
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws IOException
	{
		//OpencartLoginpage ob= new OpencartLoginpage(driver);
		OpencartLoginpg ob1=new OpencartLoginpg(driver);
		OpencartHomepg ob2=new OpencartHomepg(driver);
		OpenCartBillingDetails ob3=new OpenCartBillingDetails(driver);
		OpenCartLogout ob4=new OpenCartLogout(driver);
		/*ob.setvalues("Shalvin", " p john", "shalvin7@gmail.com", "9947107140", "Gsdsnbimp1234","Gsdsnbimp1234");
		ob.subscribe();
		ob.privacypolicy();
		ob.continuebtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
        String actualtitle=driver.getTitle();
        System.out.println(actualtitle);
        String exptitle="opencart";	
        if(exptitle.equals(actualtitle)) 
        {
        	System.out.println("Title verification passed");
        }else {
        	System.out.println("Title verification failed");
        }
        String text=driver.getPageSource();
        if(text.contains("Desktops"))
        {
        	System.out.println(" Text verification passed");
        }else {
        	System.out.println(" Text verification failed");
        }
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	//	FileHandler.copy(src,new File("C:\\Users\\91730\\Pictures\\Screenshots"));
        ob1.setvalues("shalvin77@gmail.com","Gsdsnbimp1234");
		ob1.loginbtn();
		ob2.search();
		ob2.macbookclick();
		ob2.addtocart();
		ob2.totalcartclick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob2.viewcart();
		ob2.checkoutbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob3.newaddressclick();
		ob3.setvalues("shalvin","john","kaduthodiyil (H)","Kottayam");
		ob3.dropdown();
		ob3.dropdown1();
		ob3.continuebutton();
		ob3.deldropdown();
		ob3.Delcontbtn();
		ob3.Delmethod();
		ob3.termsandconditions();
		ob3.paymethodcontbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob3.Confirmorder();
		ob3.confirmorderconbtn();
		ob4.myaccount();
		ob4.logoutbtn();
		ob4.logoutcontbtn();
	}
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
}

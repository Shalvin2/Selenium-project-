package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartLogout {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	WebElement logoutbtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
	WebElement logoutcontbtn;
	
	public OpenCartLogout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void myaccount()
	{
		myaccount.click();
	}
	public void logoutbtn()
	{
		logoutbtn.click();
	}
	public void logoutcontbtn()
	{
		logoutcontbtn.click();
	}

}
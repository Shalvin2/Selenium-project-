package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpencartLoginpg {
	
	WebDriver driver;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement loginbtn;
	
	public OpencartLoginpg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setvalues(String Email,String pass)
	{
	 email.sendKeys(Email);	
	 password.sendKeys(pass);
	}
	public void loginbtn()
	{
		loginbtn.click();
	}

}

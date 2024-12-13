package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpencartLoginpage {
	
	WebDriver driver;
	
	@FindBy(id="input-firstname")
	WebElement firstname;
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(id="input-confirm")
	WebElement confirmpassword;
	
	@FindBy(name="newsletter")
	WebElement newsletter;
	
	@FindBy(name="agree")
	WebElement privacypol;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement continuebtn;
	
	public OpencartLoginpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	public void setvalues(String FN,String LN,String Email,String tel,String pass,String confirmpass)
	{
		firstname.sendKeys(FN);
		lastname.sendKeys(LN);
		email.sendKeys(Email);
		telephone.sendKeys(tel);
		password.sendKeys(pass);
	    confirmpassword.sendKeys(confirmpass);
	}
	public void subscribe()
	{
		newsletter.click();
	}
	public void privacypolicy()
	{
		privacypol.click();
	}
	public void continuebtn()
	{
		continuebtn.click();
	}
	
	
	
	
	
}

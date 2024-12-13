package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenCartBillingDetails {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/form/div[1]/label/input")
	WebElement existingaddress;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div/form/div[3]/label/input")
	WebElement newaddress;
	
	@FindBy(id="input-payment-firstname")
	WebElement payfirstname;
	
	@FindBy(id="input-payment-lastname")
	WebElement paylastname;
	
	@FindBy(id="input-payment-address-1")
	WebElement payaddress;
	
	@FindBy(id="input-payment-city")
	WebElement paycity;
	
	@FindBy(id="input-payment-country")
	WebElement paycountry;
	
	@FindBy(id="input-payment-zone")
	WebElement paystate;
	
	@FindBy(id="button-payment-address")
	WebElement contbtn;
	
	@FindBy(xpath="//*[@id=\"shipping-existing\"]/select")
	WebElement Deliveryadd;
	
	@FindBy(id="button-shipping-address")
	WebElement Delconbtn;
	
	@FindBy(id="button-shipping-method")
	WebElement Delmethod;
	
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
	WebElement paymethodterms;
	
	@FindBy(id="button-payment-method")
	WebElement paymethodconbtn;
	
	@FindBy(id="button-confirm")
	WebElement Confirmorder;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
	WebElement confirmorderconbtn;
	
	public OpenCartBillingDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	/*public void existingaddress()
	{
		if(!existingaddress.isSelected())
		{
			existingaddress.click();
		}
	}*/
	public void newaddressclick()
	{
		newaddress.click();
	}
	public void setvalues(String FN,String LN,String PA,String PC)
	{
		payfirstname.sendKeys(FN);
		paylastname.sendKeys(LN);
		payaddress.sendKeys(PA);
		paycity.sendKeys(PC);
		
	}
	public void dropdown()
	{
		Select dropdown=new Select((paycountry));
		dropdown.selectByVisibleText("India");
    	
	}
	public void dropdown1()
	{
		Select dropdown=new Select((paystate));
		dropdown.selectByVisibleText("Kerala");
	}
    
	public void continuebutton()
	{
		contbtn.click();
	}
	public void deldropdown()
	{
		Select deldropdown=new Select(Deliveryadd);
		deldropdown.selectByIndex(2);
		
	}
	public void Delcontbtn()
	{
		Delconbtn.click();
	}
	public void Delmethod()
	{
		Delmethod.click();
	}
	
	public void termsandconditions()
	{
		paymethodterms.click();
	}
	
	public void paymethodcontbtn()
	{
		paymethodconbtn.click();
	}
	
	public void Confirmorder()
	{
		Confirmorder.click();
	}
	
	public void confirmorderconbtn()
	{
		confirmorderconbtn.click();
	}
}
package pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpencartHomepg {
	
	WebDriver Driver;
	
	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[3]/div/div[1]/a/img")
	WebElement macbookclick;
	
	@FindBy(id="button-cart")
	WebElement addtocart;
	
	@FindBy(id="cart-total")
	WebElement totalcart;
	
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
	WebElement viewcart;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a")
	WebElement checkout;
	
	public OpencartHomepg(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
	}
	
	public void search()
	{
		Search.click();
		Search.sendKeys("macbook",Keys.ENTER);
	}
	
	public void macbookclick()
	{
		macbookclick.click();
	}
	
	public void addtocart()
	{
		addtocart.click();
	} 
	
	public void totalcartclick()
	{
		totalcart.click();
	}
	
	public void viewcart()
	{
		viewcart.click();
	}
	public void checkoutbtn()
	{
		checkout.click();
	}
	

}
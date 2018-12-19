package Com.HomeJava;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(@class,'menu-content')]/li[1]")
	private WebElement WomensTap;
	
	@FindBy(xpath="//*[contains(@class,'menu-content')]/li[2]")
	private WebElement DressTap;
	
	@FindBy(xpath="//*[contains(@class,'menu-content')]/li[3]")
	private WebElement TshirtTap;
	
    public WebElement getWomenTap(){
		return WomensTap;
	}
   public WebElement getDressTap(){
    	return DressTap;
    }
   public WebElement getTshirtTap() {
	   return TshirtTap;
   }
  
   public void womenClick(){
	   WomensTap.click();
   }
   public void dressClick() {
	  DressTap.click();
   }
   public void tshirtClick() {
	   TshirtTap.click();
	
}
   
}

package Com.HomeJava;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class womenPageObject extends BasePage {

	public womenPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='cat-name']")
	private WebElement WomenText;
	
    public String getWomenText() {
    	return WomenText.getText();
    }
	
}

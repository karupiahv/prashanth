package Com.HomeJava;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DressPageObject extends BasePage {

	public DressPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='cat-name']")
	private WebElement DressText;
	
    public String getDresstext(){
		return DressText.getText();
	}
}

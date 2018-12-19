package Com.HomeJava;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPageObject extends BasePage {
	
	public TshirtPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='cat-name']")
	private WebElement TshirtText;

	public String getTshirtText() {
		return  TshirtText.getText();
	}
}

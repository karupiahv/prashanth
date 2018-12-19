package Com.HomeTest;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.Assert;
import Com.HomeJava.BasePage;
import Com.HomeJava.DressPageObject;
import Com.HomeJava.HomePageObject;
import Com.HomeJava.TshirtPageObject;
import Com.HomeJava.womenPageObject;


public class TabMenuTest  {

	HomePageObject hp;
	BasePage bp;
	womenPageObject wp;
	DressPageObject dp;
	TshirtPageObject tp;
	
	public TabMenuTest() {
		hp = new HomePageObject();
		bp = new BasePage();
		wp = new womenPageObject();
		dp = new DressPageObject();
		tp = new TshirtPageObject();
	}
	
/*	@Test
    public void verifyWomen() {
	//Assert.assertTrue(hp.getWomenTap().isDisplayed());
	Assert.assertTrue(hp.getWomenTap().isDisplayed());	
	}
	@Test
	public void verifyDress() {
	AssertJUnit.assertTrue(hp.getDressTap().isDisplayed());
	}
	@Test
	public void verifyTshirt() {
	AssertJUnit.assertTrue(hp.getTshirtTap().isDisplayed());	
	}*/
	
	@Test
	public void VerifyTab() {
		Assert.assertTrue(hp.getWomenTap().isDisplayed());
		Assert.assertTrue(hp.getDressTap().isDisplayed());
		Assert.assertTrue(hp.getTshirtTap().isDisplayed());
	}
	
	@Test
	public void verifyTabLink() {
		hp.womenClick();
	//	Assert.assertTrue(wp.getWomenText().trim().equals("WOMEN")," Faild");
		Assert.assertTrue(wp.getWomenText().trim().equals("WOMEN"),"Women page Navigationi faild");
		hp.dressClick();
	//	Assert.assertTrue(dp.getDresstext().equals("DRESSES"),"Dress page navigation faild");
		Assert.assertTrue(dp.getDresstext().trim().equals("DRESSES"),"Dress page navigation faild");
		hp.tshirtClick();
	//  Assert.assertTrue(tp.getTshirtText().equals("T-SHIRTS"),"T-shirt page navigation faild");
		Assert.assertTrue(tp.getTshirtText().trim().equals("T-SHIRTS"), "T-shirt page navigation faild");
		
	}
	
}

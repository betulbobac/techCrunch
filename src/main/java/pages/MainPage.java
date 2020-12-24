package pages;

import constant.MainPageXpathConstants;
import interfaces.IMainPage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class MainPage extends PageObject implements IMainPage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

   public ArrayList getArticleAuthorAndTitleFromList() {

	   return super.getTextOfAllElements(MainPageXpathConstants.AUTHOR);
 
		   
   }

   public boolean checkImagesLoaded() {
      return super.isImageLoaded();

}

    public void clickFirstNewOnList() {
    	super.clickElementByXpath(MainPageXpathConstants.TITLE_FIRST_NEW);
}

	public String getTextOfTitleOnPage() {
       return super.getTextOfElement(MainPageXpathConstants.TITLE_ON_PAGE);
	}

	public String getTextOfTitleOnBrowser() {
		return super.getTitleOfBrowser();
	}

	public boolean checkAllLinksLoaded() {
		return super.isLinkLoaded();
	}
}

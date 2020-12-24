package frontend;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Case1 extends BaseTest{

    @Test
    public void Demo_TC001(){

    	for(int i=0;i<mainPage.getArticleAuthorAndTitleFromList().size();i++) {
      		System.out.println(mainPage.getArticleAuthorAndTitleFromList().get(i));
    		Assert.assertNotNull(mainPage.getArticleAuthorAndTitleFromList().get(i));
    	}
    	
    	Assert.assertTrue(mainPage.checkImagesLoaded());
    	mainPage.clickFirstNewOnList();
    	Assert.assertTrue(mainPage.getTextOfTitleOnBrowser().contains(mainPage.getTextOfTitleOnPage()));
    	Assert.assertTrue(mainPage.checkAllLinksLoaded());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    	
   
}

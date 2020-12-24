package interfaces;

import java.util.ArrayList;

public interface IMainPage {
     ArrayList getArticleAuthorAndTitleFromList();
     boolean checkImagesLoaded();
     void clickFirstNewOnList();
     String getTextOfTitleOnPage();
     String getTextOfTitleOnBrowser();
     boolean checkAllLinksLoaded();

}

package Pages;

import UI.UiActions;
import org.openqa.selenium.By;

public class LandingPage {

    UiActions action = new UiActions();

    private final By postAd = By.id("navgraph_postad");


    /**
     * post Ads fun to add new Ad
     */
    public void postAds() {
        action.waitFunction(postAd,"waitVisibility");
        action.findElement(postAd).actionOnElement("click");

    }

}

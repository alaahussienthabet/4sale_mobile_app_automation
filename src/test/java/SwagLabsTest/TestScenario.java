package SwagLabsTest;


import Pages.LandingPage;
import Pages.PostAnAdPage;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * test scenario to validate  the post Ads flow
 */

public class TestScenario extends BaseClass {

 LandingPage landingPage = new LandingPage();
 PostAnAdPage postAnAdPage = new PostAnAdPage();


    /**
     * <p> Test Scenario </p>
     * <p> Step.1) Open app </p>
     * <p> Step.2) navigate to post an Ad </p>
     * <p> Step.3) Click on Choose Category </p>
     * <p> Step.4) add category </p>
     * <p> Step.5) add location </p>
     * <p> Step.6) add title </p>
     * <p> Step.7) add price </p>
     * <p> Step.8) click “Next” button </p>
     * <p> Step.9) Validate that we navigate to next screen to add media like photo </p>
     */
    @Test
    public void validateThatUserCanAddAdSuccessfully() {

        landingPage.postAds();
        postAnAdPage.addCategory("Gifts", "Messbah");
        postAnAdPage.addLocation("Ahmadi","Middle of Ahmadi","Block 9");
        postAnAdPage.addTitle("el zamalek");
        postAnAdPage.addPrice();
        postAnAdPage.actionNext();

        Assert.assertEquals(postAnAdPage.addPhoto(),"Add Photos");




    }

    /**
     * <p> Test Scenario </p>
     * <p> Step.1) Open app </p>
     * <p> Step.2) navigate to post an Ad </p>
     * <p> Step.3) Click on Choose Category </p>
     * <p> Step.4) choose any category </p>
     * <p> Step.5) click “Next” button </p>
     * <p> Step.6) Validate that there is a validation message will be displayed </p>
     */
    @Test
    public void validateThatErrorMessageIsDisplayedInCaseUserNotAddRequireFields() {
        landingPage.postAds();
        postAnAdPage.actionNext();
        Assert.assertEquals(postAnAdPage.findToasterText(),"Kindly Fill all the required information!");
    }



}



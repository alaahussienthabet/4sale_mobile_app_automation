package Pages;

import UI.UiActions;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static UI.UiActions.driver;

/**
 * adding to add all ads specification
 */

public class PostAnAdPage {
    UiActions action = new UiActions();
    CategoryPage category = new CategoryPage();
    ServiceLocationPage location = new ServiceLocationPage();

    private final By chooseCategory = By.id("chooseCategoryField");
    private final By changeCategory = By.id("button1");
    private final By listingMenu = By.id("chooseDistrictField");
    private final By doneBtn = By.xpath("//*[@text='Done']");
    private final By titleField = By.id("adTitleField");
    private final By priceField  =By.id("adPriceField");
    private final By nextBtn =By.xpath("//*[@text='Next']");
    private final By toasterMessage = By.xpath("//android.widget.Toast[1]");
    private final By addPhoto = By.xpath("//*[@text='Add Photos']");



    /**
     * select Category
     */
    public void addCategory(String categoryName, String subCategoryName) {

         action.waitFunction(chooseCategory,"waitVisibility");
         action.findElement(chooseCategory).actionOnElement("click");

        category.mainCategory(categoryName);
        category.subCategory(subCategoryName);
    }

    /**
     * add listing and location
     */
    public void addLocation(String district,String area, String block ) {

        action.waitFunction(listingMenu, "waitVisibility");
        action.findElement(listingMenu).actionOnElement("click");
        location.addDistrict(district);
        location.addArea(area);
        location.addBlock(block);
        action.waitFunction(doneBtn, "waitVisibility");
        action.findElement(doneBtn).actionOnElement("click");

    }

    /**
     * add title text
     */
    public void addTitle(String location) {

        action.waitFunction(titleField, "waitVisibility");
        action.findElement(titleField).actionOnElement("click");
        action.sendKeyToElement(location);

    }

    /**
     * add price of Ad
     */
    public void addPrice() {
        action.waitFunction(priceField, "waitVisibility");
        action.findElement(priceField).actionOnElement("click");
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));

    }


    /**
     * clicking on next button
     */
    public void actionNext() {
        action.waitFunction(nextBtn, "waitVisibility");
        action.findElement(nextBtn).actionOnElement("click");
    }

    /**
     * getting the toaster message
     */
    public String findToasterText(){
        WebElement toastView = driver.findElement(toasterMessage);
         return toastView.getText();
    }

    /**
     * adding and uploading photo
     */
    public String addPhoto(){
        action.waitFunction(addPhoto, "waitVisibility");
        WebElement addPhotos = driver.findElement(addPhoto);
        return addPhotos.getText();


    }
}

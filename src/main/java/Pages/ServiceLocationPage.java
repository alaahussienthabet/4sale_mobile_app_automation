package Pages;

import UI.UiActions;
import org.openqa.selenium.By;


/**
 * adding all location data like district, area and block
 */
public class ServiceLocationPage {
    UiActions action = new UiActions();

    private final By districtMenu = By.id("locationSelectorText");
    private final String districtOption = "//*[@text='%s']";
    private final By proceedBtn = (By.id("btnProceed"));
    private final By areaMenu = By.xpath("//*[@text='Choose Area']");
    private final String areaOption = "//*[@text='%s']";
    private final By doneBtn = By.xpath("//*[@text='Done']");
    private final By blockMenu = By.xpath("//*[@text='Choose Block']");
    private final String blockOption = "//*[@text='%s']";

    /**
     * adding the district details
     */
    public void addDistrict(String district) {


        By districtName = By.xpath(String.format(districtOption,district));
        action.waitFunction(districtMenu,"waitVisibility");
        action.findElement(districtMenu).actionOnElement("click");

        action.waitFunction(districtName,"waitVisibility");
        action.findElement(districtName).actionOnElement("click");

        action.waitFunction(proceedBtn,"waitVisibility");
        action.findElement(proceedBtn).actionOnElement("click");

    }

    /**
     * adding the area details
     */
    public void addArea(String area) {
         By areaName = By.xpath(String.format(areaOption,area));
        action.waitFunction(areaMenu, "waitVisibility");
        action.findElement(areaMenu).actionOnElement("click");

        action.waitFunction(areaName, "waitVisibility");
        action.findElement(areaName).actionOnElement("click");

        action.waitFunction(doneBtn, "waitVisibility");
        action.findElement(doneBtn).actionOnElement("click");
    }
    /**
     * adding the block details
     */
    public void addBlock(String block) {
        By blockName = By.xpath(String.format(blockOption,block));

        action.waitFunction(blockMenu, "waitVisibility");
        action.findElement(blockMenu).actionOnElement("click");

        action.waitFunction(blockName, "waitVisibility");
        action.findElement(blockName).actionOnElement("click");

        action.waitFunction(doneBtn, "waitVisibility");
        action.findElement(doneBtn).actionOnElement("click");
    }

}

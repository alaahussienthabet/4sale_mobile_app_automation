package Pages;



import UI.UiActions;
import org.openqa.selenium.By;

/**
 * adding main category and sub categories
 */
public class CategoryPage {


    UiActions action = new UiActions();

    private final String subCategory = "//*[@text='%s']";
    private final String category = "//*[@text='%s']";



    /**
     * choosing main category
     */
    public void mainCategory(String categoryName) {
        By ManinCategory = By.xpath(String.format(category,categoryName));

        action.waitFunction(ManinCategory,"waitVisibility");
        action.findElement(ManinCategory).actionOnElement("click");

    }

    /**
     * choosing subcategory
     */
    public void subCategory(String subCategoryName) {
        By subcategoryChooses = By.xpath(String.format(subCategory,subCategoryName));

        action.waitFunction(subcategoryChooses,"waitVisibility");
        action.findElement(subcategoryChooses).actionOnElement("click");

    }

}

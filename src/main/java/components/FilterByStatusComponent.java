package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterByStatusComponent {
    private WebDriver driver;
    private Actions actions;

    @FindBy(css = ".select-filter")
    private WebElement filterByStatus;

    @FindBy(css = "input[name='draft']")
    public WebElement draftCheckbox;

    @FindBy(css = "input[name='pending']")
    public WebElement pendingCheckbox;

    @FindBy(css = "input[name='paid']")
    public WebElement paidCheckbox;

    public FilterByStatusComponent(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void hoverOverFilterByStatus() {
        actions.moveToElement(filterByStatus).perform();
    }

    public void selectCheckbox(WebElement checkbox) {
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isCheckboxSelected(WebElement checkbox) {
        return checkbox.isSelected();
    }
}

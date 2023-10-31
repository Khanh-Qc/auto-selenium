package pageObject_Demo;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageUIs_Demo.*;

public class LinksObject extends BasePage {
    WebDriver driver;

    public LinksObject(WebDriver driver){this.driver = driver ; }

    public void clickHomeLink() {
        clickToElement(driver , LinksUI.homePageLinkElement );
    }

    public void clickCreateLink() {
        waitForElementClickable(driver, LinksUI.createdLinkElement);
        clickToElement(driver , LinksUI.createdLinkElement );
        String statusAPICreated = getElementText(driver, LinksUI.statusAPIElement);
        Assert.assertEquals(statusAPICreated, LinksUI.createdLinkRespone );
    }

    public void clickNoContentLink(){
        waitForElementClickable(driver, LinksUI.noContentLinkElement);
        clickToElement(driver , LinksUI.noContentLinkElement);
        String statusAPINoContent = getElementText(driver, LinksUI.statusAPIElement);
        Assert.assertEquals(statusAPINoContent, LinksUI.noContentLinkRespone );
    }
}

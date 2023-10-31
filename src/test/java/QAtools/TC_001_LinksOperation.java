package QAtools;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject_Demo.LinksObject;
import pageObject_Demo.PageGeneratorManager_Demo;
import pageObjects.BasePageObject;

public class TC_001_LinksOperation extends BaseTest {
    WebDriver driver ;
    BasePageObject basePage ;
    LinksObject linksObject ;

    @Parameters({ "browser", "url" })
    @BeforeClass
    public void beforeClass(String browserName, String appUrl) {
        driver = getBrowserDriver(browserName, appUrl);
    }

    @Test
    public void TC_001_OperationWithLinks (){
        linksObject = PageGeneratorManager_Demo.getPageGeneratorManager_Demo().getLinkObject(driver);

        // click home link
        linksObject.clickHomeLink();

        // click and compare Created link
        linksObject.clickCreateLink();

        // click and compare NoContent link
        linksObject.clickNoContentLink();
    }

    //@AfterClass(alwaysRun = true)
    public void affterClass(){
        closeBrowserAndDriver();
    }
}

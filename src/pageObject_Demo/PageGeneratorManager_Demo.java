package pageObject_Demo;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager_Demo {
    public static PageGeneratorManager_Demo getPageGeneratorManager_Demo() {
        return new PageGeneratorManager_Demo();
    }
    // generate objects page
    public LinksObject getLinkObject(WebDriver driver) {
        return new LinksObject(driver); }
}

package pageUIs_Demo;

import org.openqa.selenium.WebDriver;

public class LinksUI {
    WebDriver driver;
    public static final long timeOut = 100;
    public static final int timeSleep = 5;

    // status API response
    public static final String statusAPIElement = "//p[@id=\"linkResponse\"]";

    // expect data API
    public static final String createdLinkRespone = "Link has responded with staus 201 and status text Created" ;
    public static final String noContentLinkRespone = "Link has responded with staus 204 and status text No Content";
    public static final String movedLinkRespone = "Link has responded with staus 301 and status text Moved Permanently";
    public static final String badRequestLinkRespone = "Link has responded with staus 400 and status text Bad Request";
    public static final String unauthorizedLinkRespone = "Link has responded with staus 401 and status text Unauthorized";
    public static final String forbiddenLinkRespone = "Link has responded with staus 403 and status text Forbidden";
    public static final String notFoundLinkRespone = "Link has responded with staus 404 and status text Not Found";


    // page Link elements
    public static final String homePageLinkElement = "//a[@id=\"simpleLink\"]";
    public static final String createdLinkElement = "//a[@id=\"created\"]";
    public static final String noContentLinkElement = "//a[@id=\"no-content\"]";
    public static final String movedLinkElement = "//a[@id=\"moved\"]";
    public static final String badRequestLinkElement = "//a[@id=\"bad-request\"]";
    public static final String unauthorizedLinkElement = "//a[@id=\"unauthorized\"]";
    public static final String forbiddenLinkElement = "//a[@id=\"forbidden\"]";
    public static final String notFoundLinkElement = "//a[@id=\"forbidden\"]";
    public static final String responseLinkAPIElement = "//p[@id=\"linkResponse\"]";

}

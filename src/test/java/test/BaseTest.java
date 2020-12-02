package test;

import common.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.BasePage;
import page.HomePage;
import page.SearchPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static final long SHORT_IMPLICIT_TIMEOUT = 20;

    protected static WebDriver webDriver;

    protected HomePage homePage;
    protected BasePage basePage;
    protected SearchPage searchPage;

    @BeforeMethod
    public void initDriver(){
        webDriver = DriverProvider.getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://www.imdb.com/");

        homePage = PageFactory.initElements(webDriver,HomePage.class);
        basePage = PageFactory.initElements(webDriver, BasePage.class);
        searchPage =PageFactory.initElements(webDriver, SearchPage.class);
    }


    @AfterMethod
    public void closeDriver(){
        if(webDriver != null){
            webDriver.quit();
        }
    }

}

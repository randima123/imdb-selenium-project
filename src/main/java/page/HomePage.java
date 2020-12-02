package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver webDriver;

    public HomePage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    @FindBy(id = "suggestion-search")
    private WebElement searchBox;

    @FindBy(id = "suggestion-search-button")
    private WebElement searchButton;

    @FindBy(id = "imdbHeader-navDrawerOpen--desktop")
    private WebElement navDrawerButton;

    @FindBy(xpath = "//a[@class='ipc-list__item nav-link sc-jTzLTM fjLstn ipc-list__item--indent-one']/span[contains(text(),'Release Calendar')]")
    private WebElement releaseCalendar;

    public void enterMovie(String movieName){
        searchBox.sendKeys(movieName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void clickOnNavDrawer(){
        navDrawerButton.click();
    }

    public void clickReleaseCalender(){
        BasePage.waitForVisibility(releaseCalendar);
        BasePage.moveToElementAndClick(releaseCalendar);
    }

}

package com.next.next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderFragment extends AbstractPage {

    private static final By MY_ACCOUNT_BUTTON = By.xpath("//div[@data-testid='header-adaptive-my-account-icon-container']//a[@data-ga-v2='My Account']");

    private static final By LOGO = By.xpath("//a[@href='https://www.next.co.uk/']");

    private static final By SEARCH_FIELD = By.xpath("//input[@id='header-big-screen-search-box']");

    private static final By CLEAR_SEARCH_BUTTON = By.xpath("//a[@data-ga-v3='Delete Current Search']");

    private static final By SEARCH_BUTTON = By.xpath("//button[@type='submit']");

    private static final By MY_RECENT_SEARCHES = By.xpath("//ul[@class='header-13wlwpd']//li");

    private static final By CLEAR_ALL_BUTTON = By.xpath("//button[@data-ga-v2='Clear All Previous Search']");

    public HeaderFragment(WebDriver driver) {
        super(driver);
    }

    public WebElement getMyAccountButton() {
        return driver.findElement(MY_ACCOUNT_BUTTON);
    }

    public WebElement getLogo() {
        return driver.findElement(LOGO);
    }

    public WebElement getSearchField() {
        return driver.findElement(SEARCH_FIELD);
    }

    public WebElement getClearSearchButton() {
        return driver.findElement(CLEAR_SEARCH_BUTTON);
    }

    public WebElement getSearchButton() {
        return driver.findElement(SEARCH_BUTTON);
    }

    public WebElement getClearAllButton() {
        return driver.findElement(CLEAR_ALL_BUTTON);
    }

    public List<WebElement> getListRecentSearches() {
        return driver.findElements(MY_RECENT_SEARCHES);
    }

    public WebElement getRecentQueriesElement() {
        return driver.findElement(MY_RECENT_SEARCHES);
    }
}

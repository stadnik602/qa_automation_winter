package com.next.next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends AbstractPage {

    private static final By SEARCH_VALUE = By.xpath("//span[@data-testid='plp-product-title-text']");

    public WebElement getSearchValue() {
        return driver.findElement(SEARCH_VALUE);
    }

    public String getSearchTitleText() {
        return getSearchValue().getText();
    }

    public SearchPage(WebDriver driver) {
        super(driver);
    }
}

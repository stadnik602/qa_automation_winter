package com.next.next.flow;

import com.next.next.pages.HeaderFragment;
import com.next.next.pages.LoginPage;
import com.next.next.pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class HeaderFlow {

    private HeaderFragment headerFragment;

    public HeaderFlow(WebDriver driver) {
        this.headerFragment = new HeaderFragment(driver);
    }

    public LoginPage clickMyAccountButton(WebDriver driver) {
        headerFragment.getMyAccountButton().click();
        return new LoginPage(driver);
    }

    public void enterValueToSearchField(String searchValue) {
        headerFragment.getSearchField().sendKeys(searchValue);
    }

    public SearchPage searchSomeQuery(WebDriver driver, String searchValue) {
        enterValueToSearchField(searchValue);
        headerFragment.getSearchButton().click();
        return new SearchPage(driver);
    }

    public void clearSearchFieldByButton(String searchValue) {
        enterValueToSearchField(searchValue);
        headerFragment.getClearSearchButton().click();
    }

    public String getValueFromSearchField() {
        return headerFragment.getSearchField().getText();
    }

    public void clickOnSearchField() {
        headerFragment.getSearchField().click();
    }

    public List<WebElement> getUserRecentSearchesList() {
        return headerFragment.getListRecentSearches();
    }

    public List<String> getAllUserSearchQuery() {
        List<String> list = new ArrayList<>();
        for (WebElement element : getUserRecentSearchesList()) {
            list.add(element.getText());
        }
        return list;
    }

    public void clearAllRecentQueries() {
        headerFragment.getClearAllButton().click();
    }

    public WebElement recentBlockElement() {
        return headerFragment.getRecentQueriesElement();
    }
}

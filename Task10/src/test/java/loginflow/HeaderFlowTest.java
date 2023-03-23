package loginflow;

import com.next.next.flow.HeaderFlow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.List;


@Nested
public class HeaderFlowTest extends BaseTest {
    private final String QUERY1 = "Coat";
    private final String QUERY2 = "Jeans";

    private HeaderFlow headerFlow = new HeaderFlow(driver);

    @Test
    public void registrationPageIsOpenedByClickOnMyAccountButton() {
        driver.get("https://www.next.co.uk/");
        Assertions.assertTrue(headerFlow.clickMyAccountButton(driver)
                .getRegisterNowButton()
                .isDisplayed()
        );
    }

    @Test
    public void searchProduct() {
        driver.get("https://www.next.co.uk/");
        String actualResult = headerFlow.searchSomeQuery(driver, QUERY1).getSearchTitleText();
        String expectedResult = "\"" + QUERY1 + "\"";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void clearSearchField() {
        driver.get("https://www.next.co.uk/");
        headerFlow.clearSearchFieldByButton(QUERY1);
        Assertions.assertEquals("", headerFlow.getValueFromSearchField());
    }



    @Test
    public void userRecentSearchIsDisplayedInDropdown() {
        driver.get("https://www.next.co.uk/");
        headerFlow.searchSomeQuery(driver, QUERY1);
        headerFlow.searchSomeQuery(driver, QUERY2);
        headerFlow.clickOnSearchField();
        List<String> searchQueriesList = headerFlow.getAllUserSearchQuery();
        Assertions.assertTrue(searchQueriesList.contains(QUERY1));
        Assertions.assertTrue(searchQueriesList.contains(QUERY2));
    }

    @Test
    //проверка работает, но хотелось бы оптимизировать так, чтобы проверять, что элемент не отображается
    public void allRecentSearchesIsClearedByClearAllButtonClicking() {
        driver.get("https://www.next.co.uk/");
        headerFlow.searchSomeQuery(driver, QUERY1);
        headerFlow.clickOnSearchField();
        headerFlow.clearAllRecentQueries();
        headerFlow.searchSomeQuery(driver, QUERY2);
        headerFlow.clickOnSearchField();
        List<String> searchQueriesList = headerFlow.getAllUserSearchQuery();
        Assertions.assertFalse(searchQueriesList.contains(QUERY1));
    }
}

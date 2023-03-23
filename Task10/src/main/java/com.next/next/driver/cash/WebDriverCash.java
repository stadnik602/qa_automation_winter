package com.next.next.driver.cash;

import com.next.next.driver.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WebDriverCash {

    private static Map<String, WebDriver> drivers = new HashMap<>();

    private WebDriverCash() {

    }

    public static WebDriver getDriver(String driverName) {
        if (Objects.nonNull(drivers.get(driverName))
                && Objects.nonNull(((RemoteWebDriver)drivers.get(driverName)).getSessionId())) {
            return drivers.get(driverName);
        } else {
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            WebDriver driver = WebDriverUtils.getDriver(driverName);
            drivers.put(driverName, driver);
            return driver;
        }
    }

}

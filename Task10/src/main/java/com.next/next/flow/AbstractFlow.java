package com.next.next.flow;

import org.openqa.selenium.WebDriver;

public abstract class AbstractFlow {
    private HeaderFlow headerFragment;

    public AbstractFlow(WebDriver driver) {
        this.headerFragment = new HeaderFlow(driver);
    }

    public HeaderFlow getHeaderFragment() {
        return headerFragment;
    }
}

package org.com.compras.software.pages.interacciones;

import org.com.compras.software.pages.mapeos.MainPage;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

public class MainPageInteraction extends PageObject {

    @Page
    private MainPage mainPage;
    public String getTitleMainPage()
    {
        return mainPage.txtTitleMainPage.waitUntilVisible().getText();
    }
}

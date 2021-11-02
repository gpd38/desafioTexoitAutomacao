package com.texoit.pages;

import com.texoit.core.Driver;
import com.texoit.maps.PrincipalMap;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    private PrincipalMap principalMap;

    public PrincipalPage() {
        principalMap = new PrincipalMap();
        PageFactory.initElements(Driver.getDriver(), principalMap);
    }

    public void clickBotaoLogin() {
        principalMap.btnLogin.click();
    }

    public void clickLinkDresses() {
        principalMap.linkDresses.click();
    }
}
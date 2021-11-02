package com.texoit.pages;

import com.texoit.core.Driver;
import com.texoit.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public String getTitulo() {
        return Driver.getDriver().getTitle();
    }

    public void setEmail(String email) {
        loginMap.txtEmail.sendKeys(email);
    }

    public void setPassword(String senha) {
        loginMap.txtPassword.sendKeys(senha);
    }

    public void clickSignIn() {
        loginMap.btnSignIn.click();
    }

}

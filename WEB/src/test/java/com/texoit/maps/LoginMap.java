package com.texoit.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(id = "email")
    public WebElement txtEmail;

    @FindBy(id = "passwd")
    public WebElement txtPassword;

    @FindBy(id = "SubmitCreate")
    public WebElement btnCriarConta;

    @FindBy(id = "SubmitLogin")
    public WebElement btnSignIn;
}

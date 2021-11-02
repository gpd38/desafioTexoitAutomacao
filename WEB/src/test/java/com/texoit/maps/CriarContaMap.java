package com.texoit.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CriarContaMap {
    @FindBy(name = "title")
    public WebElement txtTitulo;

    @FindBy(id = "customer_firstname")
    public WebElement txtFirstName;

    @FindBy(id = "customer_lastname")
    public WebElement txtLastName;

    @FindBy(id = "email")
    public WebElement txtEmail;

    @FindBy(id = "passwd")
    public WebElement txtPassword;

    @FindBy(id = "address1")
    public WebElement txtAddress;

    @FindBy(id = "city")
    public WebElement txtCity;

    @FindBy(id = "id_state")
    public WebElement txtState;

    @FindBy(id = "postcode")
    public WebElement txtZipCode;

    @FindBy(id = "id_country")
    public WebElement txtCountry;

    @FindBy(id = "phone_mobile")
    public WebElement txtPhone;

    @FindBy(id = "submitAccount")
    public WebElement btnRegister;

    @FindBy(id = "SubmitLogin")
    public WebElement btnSignIn;
}

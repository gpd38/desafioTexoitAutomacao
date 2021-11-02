package com.texoit.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalMap {
    @FindBy(name = "title")
    public WebElement txtTitulo;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement btnLogin;

    @FindBy(xpath = "//div[6]/ul[1]/li[2]/a[1]")
    public WebElement linkDresses;
}
package com.texoit.pages;

import com.texoit.core.Driver;
import com.texoit.maps.MinhaContaMap;
import org.openqa.selenium.support.PageFactory;

public class MinhaContaPage {
    private MinhaContaMap minhaContaMap;

    public MinhaContaPage() {
        minhaContaMap = new MinhaContaMap();
        PageFactory.initElements(Driver.getDriver(), minhaContaMap);
    }

    public String getTitulo() {
        return Driver.getDriver().getTitle();
    }

    public void setPesquisa(String string) {
        minhaContaMap.inputSearchProdutos.sendKeys(string);
    }

    public void clickPesquisa() {
        minhaContaMap.btnSearchProdutos.click();
    }

    public void selectCountry(String country) {
//        Select select = new Select(minhaContaMap.txtCountry);
//        Driver.aguardaOptions(select);
//        select.selectByVisibleText(country);
    }
}

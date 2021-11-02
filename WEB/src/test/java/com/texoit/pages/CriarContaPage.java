package com.texoit.pages;

import com.texoit.core.Driver;
import com.texoit.maps.CriarContaMap;
import org.openqa.selenium.support.PageFactory;

public class CriarContaPage {
    private CriarContaMap criarContaMap;

    public CriarContaPage() {
        criarContaMap = new CriarContaMap();
        PageFactory.initElements(Driver.getDriver(), criarContaMap);
    }

    public String getTitulo() {
        return criarContaMap.txtTitulo.getText();
    }


}

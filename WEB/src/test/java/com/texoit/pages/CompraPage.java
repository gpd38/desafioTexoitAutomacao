package com.texoit.pages;

import com.texoit.core.Driver;
import com.texoit.maps.CompraMap;
import org.openqa.selenium.support.PageFactory;

public class CompraPage {
    private CompraMap compraMap;

    public CompraPage() {
        compraMap = new CompraMap();
        PageFactory.initElements(Driver.getDriver(), compraMap);
    }

    public String getTitulo() {
        return compraMap.txtTitulo.getText();
    }
}

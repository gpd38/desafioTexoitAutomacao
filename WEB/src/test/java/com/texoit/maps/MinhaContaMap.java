package com.texoit.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MinhaContaMap {
    @FindBy(id = "search_query_top")
    public WebElement inputSearchProdutos;

    @FindBy(name = "submit_search")
    public WebElement btnSearchProdutos;

}
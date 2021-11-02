package com.texoit.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoMap {
    @FindBy(name = "title")
    public WebElement txtTitulo;

    @FindBy(xpath = "//div[2]/a[1]/span[1]")
    public WebElement btnAddToCart;

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
    public WebElement btnProceesCheckoutSumary;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    public WebElement btnProceedCheckout;

    @FindBy(id = "list")
    public WebElement linkVisualizacaoList;

    @FindBy(xpath = "//span[contains(text(),'Summary')]")
    public WebElement infoTab;

    @FindBy(id = "cgv")
    public WebElement checkTermsOfServices;

    @FindBy(xpath = "//div[@id='HOOK_PAYMENT']/div[1]/div[1]/p[1]")
    public WebElement linkPayment;

    @FindBy(xpath = "//span[contains(.,'I confirm my order')]")
    public WebElement btnConfirmOrder;

    @FindBy(xpath = "//li[@class='ajax_block_product first-in-line first-item-of-tablet-line first-item-of-mobile-line col-xs-12']//div[@class='product-container']//div[@class='row']//div[@class='center-block col-xs-4 col-xs-7 col-md-4']//h5[@itemprop='name']//a[@class='product-name'][contains(text(),'Printed Dress')]")
    public WebElement txtProductName;

    @FindBy(xpath = "//div[@class='content_price col-xs-5 col-md-12']//span[@class='price product-price'][contains(text(),'$26.00')]")
    public WebElement txtProductPrice;

    @FindBy(xpath = "//li[@class='ajax_block_product first-in-line first-item-of-tablet-line first-item-of-mobile-line col-xs-12']//div[@class='product-container']//div[@class='row']//div[@class='right-block col-xs-4 col-xs-12 col-md-4']//div[@class='right-block-content row']//div[@class='button-container col-xs-7 col-md-12']//a[@class='button lnk_view btn btn-default']")
    public WebElement btnMoreInformation;

    @FindBy(xpath = "//table[@class='table-data-sheet']//tbody/tr[1]/td[2]")
    public WebElement txtComposition;

    @FindBy(xpath = "//table[@class='table-data-sheet']//tbody/tr[2]/td[2]")
    public WebElement txtStyles;

    @FindBy(xpath = "//table[@class='table-data-sheet']//tbody/tr[3]/td[2]")
    public WebElement txtProperties;

    @FindBy(id = "categories_block_left")
    public WebElement txtCategorias;
}
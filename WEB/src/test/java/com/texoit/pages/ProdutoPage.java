package com.texoit.pages;

import com.texoit.core.Driver;
import com.texoit.maps.ProdutoMap;
import org.openqa.selenium.support.PageFactory;

public class ProdutoPage {
    private ProdutoMap produtoMap;

    public ProdutoPage() {
        produtoMap = new ProdutoMap();
        PageFactory.initElements(Driver.getDriver(), produtoMap);
    }

    public String getTitulo() {
        Driver.visibilityOf(produtoMap.txtCategorias);
        return Driver.getDriver().getTitle();
    }

    public void clickAddCart() {
        produtoMap.btnAddToCart.click();
    }

    public void clickCheckoutSumary() {
        Driver.ScrollToElementJavaScript("800");
        Driver.visibilityOf(produtoMap.btnProceesCheckoutSumary);
        produtoMap.btnProceesCheckoutSumary.click();
    }

    public void clickCheckout() {
        //Driver.ScrollToElementJavaScript("document.body.scrollHeight");
        Driver.ScrollToElementJavaScript("800");
        Driver.visibilityOf(produtoMap.btnProceedCheckout);
        produtoMap.btnProceedCheckout.click();
    }

    public void clickListVisualization() {
        produtoMap.linkVisualizacaoList.click();
    }

    public String getInformationTab() {
        return produtoMap.infoTab.getText();
    }

    public void clickCheckTermsOfServices() {
        produtoMap.checkTermsOfServices.click();
    }

    public void clickPaymentLink() {
        produtoMap.linkPayment.click();
    }

    public void clickConfirmOrder() {
        produtoMap.btnConfirmOrder.click();
    }

    public String getNameProduct() {
        return produtoMap.txtProductName.getText();
    }

    public String getPriceProduct() {
        return produtoMap.txtProductPrice.getText();
    }

    public void clickMoreInformation() {
        produtoMap.btnMoreInformation.click();
    }

    public String getCompositionsProduct() {
        return produtoMap.txtComposition.getText();
    }

    public String getStylesProduct() {
        return produtoMap.txtStyles.getText();
    }

    public String getPropertiesProduct() {
        return produtoMap.txtProperties.getText();
    }


}

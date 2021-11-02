package com.texoit.steps;

import com.texoit.core.Driver;
import com.texoit.enums.Browser;
import com.texoit.pages.LoginPage;
import com.texoit.pages.MinhaContaPage;
import com.texoit.pages.PrincipalPage;
import com.texoit.pages.ProdutoPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;

public class PrincipalSteps {

    PrincipalPage principalPage;
    LoginPage loginPage;
    MinhaContaPage minhaContaPage;
    ProdutoPage produtoPage;

    @Before
    public void iniciaNavegador(Scenario cenario) {
        new Driver(Browser.CHROME);
        Driver.setNomeCenario(cenario.getName());
        Driver.criaDiretorio();
    }

    @After
    public void fechaNavegador(Scenario cenario) throws IOException {
        if (cenario.isFailed()) {
            Driver.printScreen("erro no cenario");
        }
        Driver.getDriver().quit();
    }

    @Dado("que estou na pagina principal")
    public void queEstouNaPaginaPrincipal() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
        principalPage = new PrincipalPage();
    }

    @Quando("clico para realizar login")
    public void clicoParaRealizarLogin() {
        principalPage.clickBotaoLogin();
    }

    @Entao("valido se estou na pagina Login My Store")
    public void validoSeEstouNaPaginaLoginMyStore() {
        loginPage = new LoginPage();
        Assert.assertEquals("Login - My Store", loginPage.getTitulo());
    }

    @Quando("informo email {string} senha {string}")
    public void informoEmailSenha(String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
    }

    @Quando("clico em SignIn")
    public void clicoEmSignIn() {
        loginPage.clickSignIn();
    }

    @Entao("valido se estou na pagina My account My Store")
    public void validoSeEstouNaPaginaMyAccountMyStore() {
        minhaContaPage = new MinhaContaPage();
        Assert.assertEquals("My account - My Store", minhaContaPage.getTitulo());
    }

    @Quando("pesquiso o produto {string}")
    public void pesquisoOProduto(String string) {
        minhaContaPage.setPesquisa(string);
        minhaContaPage.clickPesquisa();
    }

    @Quando("adiciono o produto no carrinho")
    public void adicionoOProdutoNoCarrinho() {
        produtoPage = new ProdutoPage();
        produtoPage.clickListVisualization();
        produtoPage.clickAddCart();
    }

    @Quando("clico em Proceed to checkout")
    public void clicoEmProceedToCheckout() {
        Driver.ScrollToElementJavaScript();
        produtoPage.clickCheckout();
    }

    @Entao("valido se estou na pagina Order - My Store no fluxo de pagamento da opcao Summary")
    public void validoSeEstouNaPaginaOrderMyStoreNoFluxoDePagamentoDaOpcaoSummary() {
        Assert.assertEquals("01. Summary", produtoPage.getInformationTab());
    }

    @Entao("valido se estou na pagina Order - My Store no fluxo de pagamento da opcao Address")
    public void validoSeEstouNaPaginaOrderMyStoreNoFluxoDePagamentoDaOpcaoAddress() {
        Assert.assertEquals("Addresses", produtoPage.getInformationTab());
    }

    @Entao("valido se estou na pagina Order - My Store no fluxo de pagamento da opcao Shipping")
    public void validoSeEstouNaPaginaOrderMyStoreNoFluxoDePagamentoDaOpcaoShipping() {
        Assert.assertEquals("Shipping", produtoPage.getInformationTab());
    }

    @Entao("clico em Terms of services")
    public void clicoEmTermsOfServices() {
     produtoPage.clickCheckTermsOfServices();
    }

    @Entao("valido se estou na pagina Order - My Store no fluxo de pagamento da opcao Payment")
    public void validoSeEstouNaPaginaOrderMyStoreNoFluxoDePagamentoDaOpcaoPayment() {
        Assert.assertEquals("Order - My Store", produtoPage.getInformationTab());
    }

    @Entao("escolho a forma de pagamento por cartao")
    public void escolhoAFormaDePagamentoPorCartao() {
        produtoPage.clickPaymentLink();
    }

    @Entao("clico em I confirm my order")
    public void clicoEmIConfirmMyOrder() {
        produtoPage.clickConfirmOrder();
    }

    @Entao("valido se estou na pagina Order confirmation - My Store")
    public void validoSeEstouNaPaginaOrderConfirmationMyStore() {
        Assert.assertEquals("My Store", produtoPage.getInformationTab());
    }

    @Quando("clico no menu DRESSES")
    public void clicoNoMenuDresses() {
        principalPage.clickLinkDresses();
    }
    @Entao("valido se estou na pagina {string}")
    public void validoSeEstouNaPagina(String string) {
        Assert.assertEquals(string, produtoPage.getInformationTab());
    }
    @Entao("se existe o produto {string} de preço {string}")
    public void seExisteOProdutoDePreço(String produtoName, String produtoPrice) {
        produtoPage.clickListVisualization();
        Assert.assertEquals(produtoName,produtoPage.getNameProduct());
        Assert.assertEquals(produtoPrice,produtoPage.getPriceProduct());
    }
    @Quando("clico no produto {string}")
    public void clicoNoProduto(String string) {
        produtoPage.clickMoreInformation();
    }
    @Entao("confirmo a Compositions {string} e a Styles {string} e a Properties {string}")
    public void confirmoACompositionsEAStylesEAProperties(String compositions, String styles, String properties) {
        Assert.assertEquals(string, produtoPage.get);
    }
}
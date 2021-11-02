#language:pt
@comprarProduto
Funcionalidade: Comprar Na Loja Virtual

  @validarCompra
  Cenario:Validar Fluxo De Compra
    Dado que estou na pagina principal
    Quando clico para realizar login
    Entao valido se estou na pagina Login My Store
    Quando informo email "automacao@gmail.com" senha "Senha@123"
    E clico em SignIn
    Entao valido se estou na pagina My account My Store
    Quando pesquiso o produto "Faded Short Sleeve T-shirts"
    E adiciono o produto no carrinho
    E clico em Proceed to checkout
    Entao valido se estou na pagina Order - My Store no fluxo de pagamento da opcao Summary
    E clico em Proceed to checkout
    Entao valido se estou na pagina Order - My Store no fluxo de pagamento da opcao Address
    E clico em Proceed to checkout
    Entao valido se estou na pagina Order - My Store no fluxo de pagamento da opcao Shipping
    E clico em Terms of services
    E clico em Proceed to checkout
    Entao valido se estou na pagina Order - My Store no fluxo de pagamento da opcao Payment
    E escolho a forma de pagamento por cartao
    E clico em I confirm my order
    Entao valido se estou na pagina Order confirmation - My Store

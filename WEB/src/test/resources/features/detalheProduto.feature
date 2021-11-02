#language:pt
@lojaVirtual
Funcionalidade: Validar Produto Da Loja Virtual

  @validarDetalheProduto
  Cenario:Validar Detalhe Produto
    Dado que estou na pagina principal
    Quando clico no menu DRESSES
    Entao valido se estou na pagina Dresses My Store
    E se existe o produto "Printed Dress" de preço "$26.00"
    Quando clico no produto "Printed Dress"
    Entao confirmo a Compositions "Cotton" e a Styles "Girly" e a Properties "Colorful Dress"
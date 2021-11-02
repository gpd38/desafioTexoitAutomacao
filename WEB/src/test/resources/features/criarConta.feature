#language:pt
#@lojaVirtual
Funcionalidade: Validar Produto Da Loja Virtual

  #@criarConta
  Cenario:Criar conta
    Dado que estou na pagina principal
    Quando clico para realizar login
    Entao valido se estou na pagina Login My Store
    Quando informo meu email "automacao@hotmail.com"
    E clico em create an account
    Entao valido se estou na pagina Create an account
    Quando informo os dados obrigatorios
      | First name | Last name | Password  | Address    | City   | State  | Zip/Postal Code | Mobile phone  |
      | automacao  | web       | Senha@123 | Street E12 | Kansas | Kansas | 64127           | +172098786776 |
    E clico em register
    Entao valido se estou na pagina My account My Store
    E se estou logado

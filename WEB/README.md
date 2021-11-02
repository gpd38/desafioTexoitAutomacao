# Automação WEB

<p align="center">
	<a href="#Arquitetura">Arquitetura</a> •
	<a href="#Estrutura do Projeto">Estrutura do Projeto</a>
</p>

### Arquitetura

- Linguagem Java
- JDK versão 11
- Maven
- Selenium WebDriver
- ExtentReports

### Estrutura do Projeto

```
src
├── main
└── test
    ├── java
    |	  └── texoit
    |		  ├── core (Driver do Slenium e códigos auxiliares)
    |		  ├── enums (Brownser para automação)
    |		  ├── maps (Mapeamentos das features)
    |		  ├── pages (Ações executada nas páginas)
    |		  ├── runner (Classe executora)
    |		  └── steps (Cenários de testes)
    └── resources
    	  ├── desafio
    	  |		└── Avaliação QA aut.pdf
    	  ├── evidencias (Pasta onde os printscreen serão gerados)
    	  └── features
    	  	  ├── compraProdutos.feature
    	   	  ├── criarConta.feature (Não utilizado)
   	 	      └── detalheProduto.feature

```

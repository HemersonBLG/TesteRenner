Projeto de Automação de testes Renner

Descrição
Projeto desenvolvido para demonstração de formato de desenvolvimento utilizando patterns Page Object consumindo o seguinte link: https://automationexercise.com/
Todos os cenários de testes estão escritos no formato BDD para compreensão;
Os padrões adotados no desenvolvimento foram PageObjects, PageFactory e Gherkin.

Estrutura
A linguagem utilizada foi Java;
Os hooks podem ser encontrados no pacote src/main/java/configuration/Hooks.java
Todas as features podem ser encontradas no pacote src/test/resources/features/compra.feature
Todos os steps podem ser encontrados no pacote src/test/java/steps/CompraStep.java
Todas as pages podem ser encontradas no pacote src/test/java/Pages/ComprasPage.java
Todas as funcionalidades podem ser encontradas no pacote src/test/java/Funcionalidades/CompraFuncionalidade.java
Todas as funcionalidades podem ser encontradas no pacote src/test/java/Funcionalidades/CommonFuncionalidade.java

Frameworks utilizados
Cucumber: descrição de cenários em BDD
Selenium: manipulação do webbrowser e os webelements nas pages

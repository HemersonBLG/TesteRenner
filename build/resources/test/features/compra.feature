Feature: Efetuando a compra de três itens
  Scenario: Entrar no portal e incluir itens no carrinho
    Given acessar site
    When seleciono o primeiro item
    And seleciono o segundo item
    And seleciono o terceiro item
    Then as roupas aparecem no carrinho
    And devo validar se possui roupas no carrinho
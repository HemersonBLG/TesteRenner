Feature: Comprando três peças
  Scenario: Teste para compra de três itens
    Given eu entrei no site
    When eu adiciono "3" produtos no carrinho
    Then tenho que ver "3" produtos adicionados
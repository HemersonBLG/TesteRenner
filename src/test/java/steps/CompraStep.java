package steps;

import Funcionalidades.CompraFuncionalidade;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompraStep {
    private CompraFuncionalidade compraFuncionalidade = new CompraFuncionalidade();
    @Given("acessar site")
    public void acessar_site() {
        compraFuncionalidade.acessarSite();
    }

    @When("seleciono o primeiro item")
    public void selecionoOPrimeiroItem() {
        compraFuncionalidade.clicarNoPrimeiroItem();
    }

    @And("seleciono o segundo item")
    public void selecionoOSegundoItem() {
        compraFuncionalidade.clicarNoSegundoItem();
    }

    @And("seleciono o terceiro item")
    public void selecionoOTerceiroItem() {
        compraFuncionalidade.clicarNoTerceiroItem();
    }

    @Then("as roupas aparecem no carrinho")
    public void asRoupasAparecemNoCarrinho() {
        compraFuncionalidade.clicarNoCarrinho();
    }

    @And("devo validar se possui roupas no carrinho")
    public void devoValidarSePossuiRoupasNoCarrinho() {

    }
}

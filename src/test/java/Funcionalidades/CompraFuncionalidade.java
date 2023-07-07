package Funcionalidades;

import Pages.ComprasPage;
import commons.BaseTeste;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompraFuncionalidade extends BaseTeste {

    private CommonFuncionalidade commonFuncionalidade = new CommonFuncionalidade();
    private ComprasPage comprasPage = new ComprasPage(webDriver);

    public void acessarSite(){
        commonFuncionalidade.acessarSite("https://automationexercise.com/");
    }

    public void clicarNoPrimeiroItem(){
        wait.until(ExpectedConditions.elementToBeClickable(comprasPage.getPrimeiroItem())).click();
        wait.until(ExpectedConditions.elementToBeClickable(comprasPage.getConfirmarInclusao())).click();
    }

    public void clicarNoSegundoItem(){
        wait.until(ExpectedConditions.elementToBeClickable(comprasPage.getSegundoItem())).click();
        wait.until(ExpectedConditions.elementToBeClickable(comprasPage.getConfirmarInclusao())).click();
    }

    public void clicarNoTerceiroItem(){
        wait.until(ExpectedConditions.elementToBeClickable(comprasPage.getTerceiroItem())).click();
        wait.until(ExpectedConditions.elementToBeClickable(comprasPage.getConfirmarInclusao())).click();
    }

    public void clicarNoCarrinho(){
        wait.until(ExpectedConditions.elementToBeClickable(comprasPage.getCarrinhoCompras())).click();
    }

    public void validarTabela(){
        wait.until(ExpectedConditions.attributeToBeNotEmpty(comprasPage.getTabelaLinhas(), "3"));
    }
}

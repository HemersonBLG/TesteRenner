package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ComprasPage {
    public ComprasPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[data-product-id='1']")
    private WebElement primeiroItem;

    @FindBy(css = "a[data-product-id='2']")
    private WebElement segundoItem;

    @FindBy(css = "a[data-product-id='3']")
    private WebElement terceiroItem;

    @FindBy(css = "#cartModal > div > div > div.modal-footer > button")
    private WebElement confirmarInclusao;

    @FindBy(xpath = "//*[text()='Cart']")
    private WebElement carrinhoCompras;

    @FindBy(css = "#cart_info_table > tbody")
    private WebElement tabelaCompleta;

    @FindAll(@FindBy(css = "tr"))
    private WebElement tabelaLinhas;
    public WebElement getPrimeiroItem(){
        return primeiroItem;
    }

    public WebElement getSegundoItem(){
        return segundoItem;
    }

    public WebElement getTerceiroItem(){
        return terceiroItem;
    }

    public WebElement getCarrinhoCompras(){
        return carrinhoCompras;
    }

    public WebElement getConfirmarInclusao(){
        return confirmarInclusao;
    }

    public WebElement getTabelaCompleta(){
        return tabelaCompleta;
    }

    public WebElement getTabelaLinhas(){
        return tabelaLinhas;
    }
}


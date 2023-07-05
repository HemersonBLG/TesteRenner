package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Compras {

    private WebDriver driver;
    @Given("entro no site")
    public void entroNoSite() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://automationexercise.com/");
    }

    @When("seleciono o primeiro item")
    public void selecionoOPrimeiroItem() {
        driver.findElements(By.cssSelector("a[data-product-id='1']")).get(0).click();
        driver.findElement(By.cssSelector("#cartModal > div > div > div.modal-footer > button")).click();
    }

    @And("seleciono o segundo item")
    public void selecionoOSegundoItem() {
        driver.findElements(By.cssSelector("a[data-product-id='2']")).get(0).click();
        driver.findElement(By.cssSelector("#cartModal > div > div > div.modal-footer > button")).click();

    }

    @And("seleciono o terceiro item")
    public void selecionoOTerceiroItem() {
        driver.findElements(By.cssSelector("a[data-product-id='3']")).get(0).click();
        driver.findElement(By.cssSelector("#cartModal > div > div > div.modal-footer > button")).click();

    }

    @Then("as roupas aparecem no carrinho")
    public void asRoupasAparecemNoCarrinho() {

    }

    @And("devo validar se possui roupas no carrinho")
    public void devoValidarSePossuiRoupasNoCarrinho() {
        //driver.quit();
    }


}

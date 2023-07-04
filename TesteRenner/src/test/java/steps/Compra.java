public class Compra {
    private WebDriver driver;

    @io.cucumber.java.en.Given("^eu entrei no site$")
    public void euEntreiNoSite() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
        driver.get("https://automationexercise.com/")
    }

    @io.cucumber.java.en.When("^eu adiciono \"([^\"]*)\" produtos no carrinho$")
    public void euAdicionoProdutosNoCarrinho(String arg0) throws Throwable {

        throw new cucumber.api.PendingException();
    }

    @io.cucumber.java.en.Then("^tenho que ver \"([^\"]*)\" produtos adicionados$")
    public void tenhoQueVerProdutosAdicionados(String arg0) throws Throwable {

        //driver.quit()
        throw new cucumber.api.PendingException();
    }
}

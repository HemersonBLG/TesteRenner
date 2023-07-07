package Funcionalidades;

import commons.BaseTeste;

public class CommonFuncionalidade extends BaseTeste{

    public void acessarSite(String site){
        webDriver.navigate().to(site);
    }
}

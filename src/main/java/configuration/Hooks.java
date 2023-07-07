package configuration;

import bean.enums.Web;
import commons.BaseTeste;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

    public class Hooks extends BaseTeste{

        @Before(value = "@web")
        public void beforeScenarioWeb(){
            this.inicializeBrowser();
        }

        @After(value = "@web")
        public void afterScenarioWeb(){
            closeWeb();
        }
        private void inicializeBrowser(){
            try{
                initializeWebApplication(Web.CHROME);
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

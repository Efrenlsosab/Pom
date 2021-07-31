package steps;

import com.co.sofkau.web.controllers.BCSoucedemo;
import com.co.sofkau.web.controllers.DriverController;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AutenticationSteps {
    WebDriver driver;
    @Before
    public void setUp(){
        driver = DriverController.getDriver();
    }

    @Dado("^un usuario en la pagina inicial de souce demo$")
    public void unUsuarioEnLaPaginaInicialDeSouceDemo() {
        BCSoucedemo.startApp(driver, "https://www.saucedemo.com/");

    }

    @Cuando("^el usuario ingresa un \"([^\"]*)\" y \"([^\"]*)\" correctos$")
    public void elUsuarioIngresaUnYCorrectos(String username, String password)  {
        BCSoucedemo.loginUser(driver, username, password);
         }

    @Entonces("^se puede autenticar correctamente$")
    public void sePuedeAutenticarCorrectamente() {
        Assert.assertEquals(BCSoucedemo.getTitleHome(driver), "PRODUCTS");
    }

    @After
    public void tearDown(){
driver.quit();
    }
}

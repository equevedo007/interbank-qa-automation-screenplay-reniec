package reniec.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.Set;

public class CambiarAPestana implements Interaction {

    public static CambiarAPestana nueva() {
        return Tasks.instrumented(CambiarAPestana.class);
    }

    @Override
    @Step("{0} cambia a la nueva pestaña del navegador")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String ventanaActual = driver.getWindowHandle();
        Set<String> todasLasVentanas = driver.getWindowHandles();

        for (String ventana : todasLasVentanas) {
            if (!ventana.equals(ventanaActual)) {
                driver.switchTo().window(ventana);
                break;
            }
        }
    }
}

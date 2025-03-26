package reniec.tasks;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class VolverAPestanaOriginal implements Task {

    public static VolverAPestanaOriginal ahora(){
        return Tasks.instrumented(VolverAPestanaOriginal.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver navegador = BrowseTheWeb.as(actor).getDriver();
        ArrayList<String> pestañas = new ArrayList<>(navegador.getWindowHandles());

        // Regresamos a la primera pestaña (RENIEC original)
        navegador.switchTo().window(pestañas.get(0));

    }
}

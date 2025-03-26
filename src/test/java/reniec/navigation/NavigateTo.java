package reniec.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable ReniecHomePage() {
        return Task.where("{0} abre la pagina principal de RENIEC",
                Open.browserOn().the(ReniecGoHome.class));
    }
}

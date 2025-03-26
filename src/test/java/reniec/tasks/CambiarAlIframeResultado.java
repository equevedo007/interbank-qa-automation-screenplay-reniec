package reniec.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Switch;

import static reniec.userinterfaces.ConsuladoPage.IFRAME_RESULTADO;

public class CambiarAlIframeResultado implements Task {

    public static CambiarAlIframeResultado ahora() {
        return Tasks.instrumented(CambiarAlIframeResultado.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame(IFRAME_RESULTADO.resolveFor(actor)));
    }
}

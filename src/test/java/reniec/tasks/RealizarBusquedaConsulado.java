package reniec.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reniec.userinterfaces.ConsuladoPage;

public class RealizarBusquedaConsulado implements Task {

    public static RealizarBusquedaConsulado ClickRealizarBusquedaConsulado() {
        return Tasks.instrumented(RealizarBusquedaConsulado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ConsuladoPage.BOTON_BUSCAR)
        );

    }
}

package reniec.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.waits.Wait;
import reniec.userinterfaces.ReniecPage;

public class SeleccionarListaConsulados implements Task {

    public static SeleccionarListaConsulados haciaSeleccionarListaConsulados() { return Tasks.instrumented(SeleccionarListaConsulados.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReniecPage.LISTA_CONSULADOS_EN_EL_MUNDO),
                new OpenUrl("https://www.consulado.pe/paginas/Inicio.aspx")
        );
    }
}

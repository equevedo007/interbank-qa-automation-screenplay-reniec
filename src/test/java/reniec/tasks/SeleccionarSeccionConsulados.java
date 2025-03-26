package reniec.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reniec.userinterfaces.ReniecPage;

public class SeleccionarSeccionConsulados implements Task {

    public static SeleccionarSeccionConsulados haciaLaSeccionConsulados() { return Tasks.instrumented(SeleccionarSeccionConsulados.class); }



    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(ReniecPage.PERUANOS_EXTRANJERO));

    }
}

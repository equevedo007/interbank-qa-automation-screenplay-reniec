package reniec.tasks;

import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reniec.userinterfaces.ConsuladoPage;

public class EscribirOficinaConsular implements Task {

    private final String oficina;

    public EscribirOficinaConsular(String oficina) {
        this.oficina = oficina;
    }

    public static EscribirOficinaConsular escribirOficinaConsular(String oficina) {
        return Tasks.instrumented(EscribirOficinaConsular.class, oficina);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ConsuladoPage.CAMPO_BUSQUEDA_CONSULADO),
                Enter.theValue(oficina).into(ConsuladoPage.CAMPO_BUSQUEDA_CONSULADO)
        );

    }
}

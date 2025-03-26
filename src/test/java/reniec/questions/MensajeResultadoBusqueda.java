package reniec.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import reniec.userinterfaces.ConsuladoPage;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeResultadoBusqueda {


    public static Question<String> es() {
        return actor -> {
            the(ConsuladoPage.RESULTADO_CONSULADO_CUENCA, isVisible()).forNoMoreThan(10).seconds().performAs(actor);
            return Text.of(ConsuladoPage.RESULTADO_CONSULADO_CUENCA).answeredBy(actor).trim();
        };
    }
}

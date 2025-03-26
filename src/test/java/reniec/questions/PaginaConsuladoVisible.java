package reniec.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Visibility;
import reniec.userinterfaces.ConsuladoPage;

public class PaginaConsuladoVisible {

    public static Question<String> es() {
        return actor -> BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    }
}

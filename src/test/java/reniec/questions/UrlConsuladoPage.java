package reniec.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class UrlConsuladoPage {
    public static Question<String> es() {
        return actor -> BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    }
}

package reniec.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReniecPage {

    public static final Target PERUANOS_EXTRANJERO = Target.the("seccion Peruanos en el Extranjero")
            .located(By.xpath("//h3[a[text()='CONSULADOS EN EL MUNDO']]/a"));

    public static final Target LISTA_CONSULADOS_EN_EL_MUNDO = Target.the("link Lista de Consulados en el mundo")
            .located(By.xpath("//a[contains(text(),'Lista de Consulados en el mundo')]"));




}

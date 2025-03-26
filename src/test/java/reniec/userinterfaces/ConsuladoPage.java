package reniec.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsuladoPage {

    public static final Target CAMPO_BUSQUEDA_CONSULADO = Target.the("campo de busqueda de oficina consular")
            .located(By.id("txtSearch"));

    public static final Target BOTON_BUSCAR = Target.the("boton para realizar la busqueda")
            .located(By.xpath("//img[@class='imgSearchLupa' and @title='Realiza búsquedas']"));

    public static final Target RESULTADO_CONSULADO_CUENCA = Target.the("resultado con el nombre Cuenca")
            .locatedBy("//a[contains(@class,'linkConsulado') and contains(text(),'Cuenca')]");

    public static final Target IFRAME_RESULTADO = Target.the("iframe del resultado")
            .located(By.cssSelector("iframe[src*='resultado.aspx']"));


}

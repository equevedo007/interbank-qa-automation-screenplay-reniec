package reniec.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import reniec.interactions.CambiarAPestana;
import reniec.navigation.NavigateTo;
import reniec.questions.MensajeResultadoBusqueda;
import reniec.questions.UrlConsuladoPage;
import reniec.tasks.*;


public class ReniecConsuladosBusquedaSteps {

    private Actor actor;

    @Given("que el {actor} abre la paina principal de RENIEC")
    public void que_el_ciudadano_abre_la_paina_principal_de_reniec(Actor actor) {
        this.actor = actor;
        actor.attemptsTo(NavigateTo.ReniecHomePage());

    }
    @When("hace clic en CONSULADOS EN EL MUNDO")
    public void hace_clic_en_consulados_en_el_mundo() {
        actor.attemptsTo(SeleccionarSeccionConsulados.haciaLaSeccionConsulados());
    }
    @Then("selecciona Lista de Consulados en el mundo")
    public void selecciona_lista_de_consulados_en_el_mundo() {
        actor.attemptsTo(SeleccionarListaConsulados.haciaSeleccionarListaConsulados());
    }

    @Then("cambia a la nueva pestana abierta")
    public void cambia_a_la_nueva_pestana_abierta() {
        actor.attemptsTo(CambiarAPestana.nueva());
        actor.should(
                seeThat(UrlConsuladoPage.es(), equalTo("https://www.consulado.pe/paginas/Inicio.aspx"))
        );

    }

    @Then("escribe {string} en el campo de búsqueda de oficina consular")
    public void escribe_en_el_campo_de_búsqueda_de_oficina_consular(String oficinaConsular) {
        actor.attemptsTo(
                EscribirOficinaConsular.escribirOficinaConsular(oficinaConsular)
        );
    }
    @Then("realiza la busqueda")
    public void realiza_la_busqueda() {
        actor.attemptsTo(RealizarBusquedaConsulado.ClickRealizarBusquedaConsulado());

    }
    @Then("debería ver un mensaje con el texto {string}")
    public void debería_ver_un_mensaje_con_el_texto(String string) {

        actor.attemptsTo(CambiarAlIframeResultado.ahora());
        actor.should(
                seeThat(MensajeResultadoBusqueda.es(), equalTo(string))
        );
    }
    @Then("regresa a la pestana original")
    public void regresa_a_la_pestana_original() {

        actor.attemptsTo(VolverAPestanaOriginal.ahora());

    }

}

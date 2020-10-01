package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TodoTestDataDrive;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.PreguntaUsuario;
import tasks.Abrir;
import tasks.Registrar;

import java.util.List;

public class TodoTestStespDefinitions {
   @Before
   public void setStage(){
       OnStage.setTheStage(new OnlineCast());
   }

    @Given("^ingreso al sitio web$")
    public void ingresoAlSitioWeb() {
      OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());
    }

    @When("^Diligenciar todos los campos y registrar un usuario$")
    public void diligenciarTodosLosCamposYRegistrarUnUsuario(List<TodoTestDataDrive> losdatos) {
       OnStage.theActorInTheSpotlight().attemptsTo(Registrar.unUsuarioCon(losdatos));
    }

    @Then("^Verificar el registro exitoso\"([^\"]*)\"$")
    public void verificarElRegistroExitoso(String pregunta) {
     OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaUsuario.seRegistro(pregunta)));
    }
}

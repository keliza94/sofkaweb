package com.example.stepdefinitions.web;

import com.example.tasks.web.*;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprasStepsDefs {
    private Scenario scenario;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 1)
    public void setScenario (Scenario scenario){
        this.scenario = scenario;
    }

    @Given("que el {string} esta en la home de Opencart")
    public void queElClienteEstaEnLaHomeDeOpencart(String actor) {
        theActorCalled(actor).attemptsTo(
                NavigateTo.opencartPage()
        );
        screenShot();
    }

    @When("agrego los siguientes productos al carrito:")
    public void agregoLosProductosAlCarrito(List<String> productos) {
        productos.forEach(producto -> {
            theActorInTheSpotlight().attemptsTo(
                    AgregarProducto.alCarrito(producto)
            );
        });
        screenShot();
    }

    @Then("el carrito debe mostrar los dos productos seleccionados:")
    public void elCarritoDebeMostrarLosProductos(List<String> productosEsperados) {
        theActorInTheSpotlight().should(
                seeThat(VisualizarCarrito.contieneLosProductos(productosEsperados))
        );
    }

    @When("completo el formulario de compra con los siguientes datos:")
    public void completoElFormularioDeCompraConLosDatos(Map<String, String> datosDelFormulario) {
        theActorInTheSpotlight().attemptsTo(
                CompletarFormularioDeCompra.conLosDatos(datosDelFormulario)
        );
    }

    @Then("visualiza la modal de confirmacion y finaliza")
    public void visualizaLaModalDeConfirmacionYFinaliza() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarYFinalizarCompra.confirmacionModal()
        );
    }







    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) BrowseTheWeb.as(theActorInTheSpotlight()).getDriver()).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
}
package com.example.tasks.web;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VisualizarYFinalizarCompra implements Task {

    // Selector para la modal de confirmación de compra
    private static final By MODAL_CONFIRMACION_SELECTOR = By.cssSelector(".sweet-alert");

    // Selector para el botón OK en la modal
    private static final By BOTON_OK_SELECTOR = By.cssSelector(".sweet-alert button.confirm");

    public static VisualizarYFinalizarCompra confirmacionModal() {
        return instrumented(VisualizarYFinalizarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Verificar si la modal está visible
        actor.attemptsTo(
                Check.whether(Visibility.of(MODAL_CONFIRMACION_SELECTOR).answeredBy(actor))  // Usamos answeredBy() en lugar de viewedBy()
                        .andIfSo(Click.on(BOTON_OK_SELECTOR))  // Si la modal está visible, hacer clic en OK
        );
    }
}

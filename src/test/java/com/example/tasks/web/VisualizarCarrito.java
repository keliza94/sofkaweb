package com.example.tasks.web;

import com.example.questions.web.CarritoQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import java.util.List;

public class VisualizarCarrito implements Question<Boolean> {

    private final List<String> productosEsperados;

    public VisualizarCarrito(List<String> productosEsperados) {
        this.productosEsperados = productosEsperados;
    }

    public static VisualizarCarrito contieneLosProductos(List<String> productosEsperados) {
        return new VisualizarCarrito(productosEsperados);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(By.xpath("//a[text()='Cart']"))
        );
        List<String> productosEnCarrito = actor.asksFor(CarritoQuestion.productosEnElCarrito());

        return productosEsperados.containsAll(productosEnCarrito);
    }
}

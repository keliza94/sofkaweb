package com.example.questions.web;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;
import java.util.List;
import java.util.stream.Collectors;

public class CarritoQuestion {

    // Verificar si el carrito está vacío
    public static Question<Boolean> estaVacio() {
        return actor -> {
            List<String> productosEnCarrito = Text.ofEach(By.cssSelector(".success td:nth-child(2)")).asListOf(String.class).answeredBy(actor);

            // Si no hay productos, la lista estará vacía
            return productosEnCarrito.isEmpty();
        };
    }

    // Obtener los nombres de los productos en el carrito
    public static Question<List<String>> productosEnElCarrito() {
        return actor -> Text.ofEach(By.cssSelector(".success td:nth-child(2)")).asListOf(String.class).answeredBy(actor);
    }
}

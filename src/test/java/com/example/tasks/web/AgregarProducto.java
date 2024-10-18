package com.example.tasks.web;

import com.example.userinterfaces.pages.HomePage;
import com.example.userinterfaces.pages.ProductPage;
import com.example.userinterfaces.screens.PurchaseFormScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProducto implements Task {

    private String nombreProducto;

    public AgregarProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static AgregarProducto alCarrito(String producto) {
        return new AgregarProducto(producto);
    }

    @Override
    @Step("{0} agrega el producto #nombreProducto al carrito")
    public <T extends Actor> void performAs(T actor) {
        // Seleccionar el producto por nombre
        actor.attemptsTo(
                Click.on(By.linkText(nombreProducto)),
                WaitUntil.the(ProductPage.ADD_TO_CART_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ProductPage.ADD_TO_CART_BUTTON),
                Click.on(ProductPage.HOME_BUTTON)

        );




    }
}

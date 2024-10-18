package com.example.tasks.web;

import com.example.userinterfaces.pages.CartPage;
import com.example.userinterfaces.pages.ProductPage;
import com.example.userinterfaces.screens.PurchaseFormScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.Step;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletarFormularioDeCompra implements Task {

    private final Map<String, String> datosDelFormulario;

    public CompletarFormularioDeCompra(Map<String, String> datosDelFormulario) {
        this.datosDelFormulario = datosDelFormulario;
    }

    public static CompletarFormularioDeCompra conLosDatos(Map<String, String> datosDelFormulario) {
        return instrumented(CompletarFormularioDeCompra.class, datosDelFormulario);
    }


    @Override
    @Step("{0} completa el formulario de compra con los datos proporcionados")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductPage.CART_TOTAL, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ProductPage.CART_TOTAL),

                WaitUntil.the(ProductPage.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ProductPage.CHECKOUT_BUTTON),

                WaitUntil.the(PurchaseFormScreen.GUEST_RADIO_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchaseFormScreen.GUEST_RADIO_BUTTON),

                WaitUntil.the(PurchaseFormScreen.CONTINUE_BUTTON, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(PurchaseFormScreen.CONTINUE_BUTTON),

                Enter.theValue(datosDelFormulario.get("Firstname")).into(PurchaseFormScreen.NAME_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Lastname")).into(PurchaseFormScreen.LASTNAME_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Email")).into(PurchaseFormScreen.EMAIL_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Telephone")).into(PurchaseFormScreen.TELEPHONE_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Address1")).into(PurchaseFormScreen.ADDRESS_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("City")).into(PurchaseFormScreen.CYTY_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("PostCode")).into(PurchaseFormScreen.POSTCODE_INPUT_FIELD),


                // Asegúrate de que el dropdown esté visible antes de interactuar
                WaitUntil.the(PurchaseFormScreen.COUNTRY_DROPDOWN, isVisible()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(datosDelFormulario.get("Country")).from(PurchaseFormScreen.COUNTRY_DROPDOWN),

                WaitUntil.the(PurchaseFormScreen.REGION_ESTATE_DROPDOWN, isEnabled()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(datosDelFormulario.get("Region")).from(PurchaseFormScreen.REGION_ESTATE_DROPDOWN),

                // Asegúrate de que todos los campos se llenen antes de continuar
                //Click.on(PurchaseFormScreen.SHIPPING_ADDRESS_CHECKBOX),
                Click.on(PurchaseFormScreen.GUEST_CONTINUE_BUTTON),

                /*
                Enter.theValue(datosDelFormulario.get("Firstnameshipping")).into(PurchaseFormScreen.FIRSTNAME_SHIPPING_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Lastnameshipping")).into(PurchaseFormScreen.LASTNAME_SHIPPING_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Address1shipping")).into(PurchaseFormScreen.ADDRESS1_SHIPPING_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("Cityshipping")).into(PurchaseFormScreen.CITY_SHIPPING_INPUT_FIELD),
                Enter.theValue(datosDelFormulario.get("PostCodeshipping")).into(PurchaseFormScreen.POSTCODE_SHIPPING_INPUT_FIELD),


                // Asegúrate de que el dropdown esté visible antes de interactuar
                WaitUntil.the(PurchaseFormScreen.COUNTRY_SHIPPING_DROPDOWN, isVisible()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(datosDelFormulario.get("Countryshipping")).from(PurchaseFormScreen.COUNTRY_SHIPPING_DROPDOWN),

                WaitUntil.the(PurchaseFormScreen.REGION_SHIPPING_DROPDOWN, isEnabled()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(datosDelFormulario.get("Regionshipping")).from(PurchaseFormScreen.REGION_SHIPPING_DROPDOWN),

                // Asegúrate de que todos los campos se llenen antes de continuar
                //Click.on(PurchaseFormScreen.GUEST_CONTINUE_BUTTON),
                Click.on(PurchaseFormScreen.CONTINUE_SHIPPING_BUTTON),*/
                Enter.theValue(datosDelFormulario.get("Comment")).into(PurchaseFormScreen.COMMENT_TEXTAREA),

                //WaitUntil.the(PurchaseFormScreen.AGREE_CHECKBOX, isVisible()).forNoMoreThan(20).seconds(),

                Click.on(PurchaseFormScreen.SHIPPING_METHOD_CONTINUE_BUTTON),

                WaitUntil.the(PurchaseFormScreen.PAYMENT_METHOD_CONTINUE_BUTTON, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(PurchaseFormScreen.AGREE_CHECKBOX),
                Click.on(PurchaseFormScreen.PAYMENT_METHOD_CONTINUE_BUTTON),

                WaitUntil.the(PurchaseFormScreen.CONFIRM_ORDER_BUTTON, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(PurchaseFormScreen.CONFIRM_ORDER_BUTTON),
                WaitUntil.the(PurchaseFormScreen.FINISH_ORDER_BUTTON, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(PurchaseFormScreen.FINISH_ORDER_BUTTON)
        );
    }

}

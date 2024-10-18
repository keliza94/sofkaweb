package com.example.tasks.web;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AceptarAlert implements Task {

    @Override
    @Step("{0} acepta el alert si está presente")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = net.serenitybdd.core.Serenity.getWebdriverManager().getCurrentDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1)); // Espera de hasta 10 segundos para el alert

        try {
            // Esperar hasta que el alert esté presente
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept(); // Aceptar el alert cuando aparece
        } catch (Exception e) {
            System.out.println("[Exception] No se encontró ningún alert: " + e.getMessage());
        }
    }

    public static AceptarAlert aceptar() {
        return instrumented(AceptarAlert.class);
    }
}

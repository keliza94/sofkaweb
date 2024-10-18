package com.example.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target PLACE_ORDER_BUTTON = Target.the("Botón para realizar la compra").located(By.xpath("//button[text()='Place Order']"));

}

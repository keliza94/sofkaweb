package com.example.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    public static final Target ADD_TO_CART_BUTTON = Target
            .the("Botón para añadir producto al carrito")
            .located(By.xpath("//button[contains(@id, 'button-cart')]"));

    public static final Target HOME_BUTTON = Target
            .the("Botón de Home")
            .located(By.cssSelector("a[href='http://opencart.abstracta.us:80/index.php?route=common/home']"));


        public static final Target CART_TOTAL = Target
                .the("Total del carrito de compras")
                .located(By.xpath("//span[@id='cart-total']"));

    public static final Target CHECKOUT_BUTTON = Target
            .the("Botón de Checkout")
            .located(By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=checkout/checkout']"));
}

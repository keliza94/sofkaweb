package com.example.userinterfaces.screens;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseFormScreen {
    public static final Target GUEST_RADIO_BUTTON = Target
            .the("Opción de cuenta invitado")
            .located(By.xpath("//input[@type='radio' and @name='account' and @value='guest']"));
    public static final Target CONTINUE_BUTTON = Target
            .the("Botón Continuar en el formulario de cuenta")
            .located(By.xpath("//input[@type='button' and @value='Continue' and @id='button-account' and @data-loading-text='Loading...']"));
    public static final Target GUEST_CONTINUE_BUTTON = Target
            .the("Botón Continuar para invitado")
            .located(By.xpath("//input[@type='button' and @value='Continue' and @id='button-guest' and @data-loading-text='Loading...']"));
    public static final Target AGREE_CHECKBOX = Target
            .the("Checkbox de acuerdo a los términos")
            .located(By.xpath("//input[@type='checkbox' and @name='agree' and @value='1']"));
    public static final Target PAYMENT_METHOD_CONTINUE_BUTTON = Target
            .the("Botón Continuar en el método de pago")
            .located(By.xpath("//input[@type='button' and @value='Continue' and @id='button-payment-method' and @data-loading-text='Loading...']"));

    public static final Target NAME_INPUT_FIELD = Target.the("Campo para introducir el nombre").located(By.id("input-payment-firstname"));
    public static final Target LASTNAME_INPUT_FIELD = Target.the("Campo para introducir el apellido").located(By.id("input-payment-lastname"));
    public static final Target EMAIL_INPUT_FIELD = Target.the("Campo para introducir el email").located(By.id("input-payment-email"));
    public static final Target TELEPHONE_INPUT_FIELD = Target.the("Campo para introducir el ZZ").located(By.id("input-payment-telephone"));
    public static final Target ADDRESS_INPUT_FIELD = Target.the("Campo para introducir el address1").located(By.id("input-payment-address-1"));
    public static final Target CYTY_INPUT_FIELD = Target.the("Campo para introducir la ciudad").located(By.id("input-payment-city"));
    public static final Target POSTCODE_INPUT_FIELD = Target.the("Campo para introducir el nombre").located(By.id("input-payment-postcode"));

    public static final Target COUNTRY_DROPDOWN = Target
            .the("Dropdown de selección de país en el formulario de pago")
            .located(By.xpath("//select[@name='country_id' and @id='input-payment-country']"));
    public static final Target REGION_ESTATE_DROPDOWN = Target
            .the("Dropdown de selección de zona en el formulario de pago")
            .located(By.xpath("//select[@name='zone_id' and @id='input-payment-zone']"));
    public static final Target SHIPPING_ADDRESS_CHECKBOX = Target
            .the("Checkbox de dirección de envío")
            .located(By.name("shipping_address"));
    public static final Target CONFIRM_ORDER_BUTTON = Target
            .the("Botón Confirmar Pedido")
            .located(By.xpath("//input[@type='button' and @value='Confirm Order' and @id='button-confirm' and @data-loading-text='Loading...']"));
    public static final Target FIRSTNAME_SHIPPING_INPUT_FIELD = Target
            .the("Campo de texto para el primer nombre shipping")
            .located(By.id("input-shipping-firstname"));
    public static final Target LASTNAME_SHIPPING_INPUT_FIELD = Target
            .the("Campo de texto para el apellido shipping")
            .located(By.id("input-shipping-lastname"));
    public static final Target ADDRESS1_SHIPPING_INPUT_FIELD = Target
            .the("Campo de texto para Address 1 shipping")
            .located(By.id("input-shipping-address-1"));
    public static final Target CITY_SHIPPING_INPUT_FIELD = Target
            .the("Campo de texto para la ciudad shipping")
            .located(By.id("input-shipping-city"));
    public static final Target POSTCODE_SHIPPING_INPUT_FIELD = Target
            .the("Campo de texto para código postal shipping")
            .located(By.id("input-shipping-postcode"));
    public static final Target COUNTRY_SHIPPING_DROPDOWN = Target
            .the("Dropdown de selección de país shipping")
            .located(By.id("input-shipping-country"));
    public static final Target REGION_SHIPPING_DROPDOWN = Target
            .the("Dropdown de selección de región o estado shipping")
            .located(By.id("input-shipping-zone"));
    public static final Target CONTINUE_SHIPPING_BUTTON = Target
            .the("Botón de continuar en el envío de invitado")
            .located(By.id("button-guest-shipping"));

    public static final Target COMMENT_TEXTAREA = Target
            .the("Caja de texto para comentarios")
            .located(By.name("comment"));
    public static final Target SHIPPING_METHOD_CONTINUE_BUTTON = Target
            .the("Botón de continuar en el método de envío")
            .located(By.id("button-shipping-method"));
    public static final Target FINISH_ORDER_BUTTON = Target
            .the("Botón de continuar en el enlace")
            .located(By.xpath("//a[@href='http://opencart.abstracta.us:80/index.php?route=common/home' and contains(@class, 'btn-primary')]"));


}


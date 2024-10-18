package com.example.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target HOME_MENU = Target.the("Menu de inicio").located(By.xpath("//a[text()='Home ']"));

}

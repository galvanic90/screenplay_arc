package co.com.udea.moduloprueba.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Dropdown;

public class HomePage {
    public static final Target FROM = Target.the("Home page").located(By.name("fromPort"));

}

package co.com.udea.moduloprueba.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target FROM = Target.the("Origin for travel").located(By.name("fromPort"));
    public static final Target TO = Target.the("Destination for travel").located(By.name("toPort"));
    public static final Target FIND_FLIGHTS = Target.the("Find flights").located(By.cssSelector("[type=submit]"));

}

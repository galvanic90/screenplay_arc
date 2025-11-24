package co.com.udea.moduloprueba.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightResultsPage extends PageObject {
    public static final Target FLIGHT_ROWS = 
            Target.the("flight result rows")
                .locatedBy("tbody tr");

    // Columns inside a row
    public static final Target FLIGHT_NUMBER =
            Target.the("flight number")
                .locatedBy(".//td[2]");

    public static final Target AIRLINE_NAME =
            Target.the("airline name in row")
                .locatedBy(".//td[3]");
}
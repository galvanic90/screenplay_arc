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

    public static final Target FIRST_FLIGHT_ROW =
            Target.the("first flight row")
                    .locatedBy(".//tr[1]");

    public static final Target FIRST_CHOOSE_BUTTON =
            Target.the("first choose flight button")
                    .locatedBy("//table/tbody/tr[1]//input[@type='submit' and @value='Choose This Flight']");
}
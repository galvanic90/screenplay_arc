package co.com.udea.moduloprueba.tasks;

import co.com.udea.moduloprueba.pages.FlightBookingPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PurchaseFlight {
    public static Performable now() {
        return Task.where("{0} clicks on Purchase Flights",
                Click.on(FlightBookingPage.PURCHASE_FLIGHTS)
        );
    }
}

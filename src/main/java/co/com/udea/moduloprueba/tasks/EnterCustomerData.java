package co.com.udea.moduloprueba.tasks;

import co.com.udea.moduloprueba.pages.FlightBookingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Map;

public class EnterCustomerData implements Task {

    private final String field;
    private final String value;

    private static final Map<String, Target> FIELD_MAP = Map.of(
            "name", FlightBookingPage.NAME_FIELD,
            "address", FlightBookingPage.ADDRESS_FIELD,
            "city", FlightBookingPage.CITY_FIELD,
            "state", FlightBookingPage.STATE_FIELD,
            "zip", FlightBookingPage.ZIP_FIELD,
            "cardType", FlightBookingPage.CARD_TYPE,
            "cardNumber", FlightBookingPage.CARD_NUMBER,
            "month", FlightBookingPage.MONTH_FIELD,
            "year", FlightBookingPage.YEAR_FIELD,
            "cardName", FlightBookingPage.CARD_NAME
    );

    public EnterCustomerData(String field, String value) {
        this.field = field;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target target = FIELD_MAP.get(field);

        if (target == null) {
            throw new IllegalArgumentException("Unknown field: " + field);
        }

        // Dropdown handling
        if (field.equals("cardType")) {
            actor.attemptsTo(
                    SelectFromOptions.byVisibleText(value).from(target)
            );
        }
        // Default: type into input field
        else {
            actor.attemptsTo(
                    Enter.theValue(value).into(target)
            );
        }
    }

    // Factory methods
    public static EnterCustomerData name(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "name", value);
    }

    public static EnterCustomerData address(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "address", value);
    }

    public static EnterCustomerData city(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "city", value);
    }

    public static EnterCustomerData state(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "state", value);
    }

    public static EnterCustomerData zip(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "zip", value);
    }

    public static EnterCustomerData cardType(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "cardType", value);
    }

    public static EnterCustomerData cardNumber(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "cardNumber", value);
    }

    public static EnterCustomerData month(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "month", value);
    }

    public static EnterCustomerData year(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "year", value);
    }

    public static EnterCustomerData cardName(String value) {
        return Tasks.instrumented(EnterCustomerData.class, "cardName", value);
    }

}

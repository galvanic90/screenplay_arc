package co.com.udea.moduloprueba.questions;

import co.com.udea.moduloprueba.pages.FlightBookingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TextOfField {
    public static Question<String> name() {
        return actor -> FlightBookingPage.NAME_FIELD.resolveFor(actor).getValue();
    }

    public static Question<String> address() {
        return actor -> FlightBookingPage.ADDRESS_FIELD.resolveFor(actor).getValue();
    }

    public static Question<String> city() {
        return actor -> FlightBookingPage.CITY_FIELD.resolveFor(actor).getValue();
    }

    public static Question<String> state() {
        return actor -> FlightBookingPage.STATE_FIELD.resolveFor(actor).getValue();
    }

    public static Question<String> zip() {
        return actor -> FlightBookingPage.ZIP_FIELD.resolveFor(actor).getValue();
    }

    public static Question<String> cardType() {
        return actor -> FlightBookingPage.CARD_TYPE.resolveFor(actor).getSelectedVisibleTextValue();
    }

    public static Question<String> cardNumber() {
        return actor -> FlightBookingPage.CARD_NUMBER.resolveFor(actor).getValue();
    }

    public static Question<String> month() {
        return actor -> FlightBookingPage.MONTH_FIELD.resolveFor(actor).getValue();
    }

    public static Question<String> year() {
        return actor -> FlightBookingPage.YEAR_FIELD.resolveFor(actor).getValue();
    }

    public static Question<String> cardName() {
        return actor -> FlightBookingPage.CARD_NAME.resolveFor(actor).getValue();
    }
}

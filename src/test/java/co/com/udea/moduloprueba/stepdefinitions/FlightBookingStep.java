package co.com.udea.moduloprueba.stepdefinitions;

import co.com.udea.moduloprueba.pages.FlightBookingPage;
import co.com.udea.moduloprueba.tasks.EnterCustomerData;
import co.com.udea.moduloprueba.questions.TextOfField;
import co.com.udea.moduloprueba.tasks.PurchaseFlight;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class FlightBookingStep {

    // NAME
    @When("{actor} writes her name {string}")
    public void writeName(Actor actor, String name) {
        actor.attemptsTo(EnterCustomerData.name(name));
    }

    @Then("{actor} sees that the name is {string}")
    public void seesThatName(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.name(), equalTo(expected)));
    }

    // ADDRESS
    @When("{actor} writes her address {string}")
    public void writeAddress(Actor actor, String address) {
        actor.attemptsTo(EnterCustomerData.address(address));
    }

    @Then("{actor} sees her address is {string}")
    public void checkAddress(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.address(), equalTo(expected)));
    }

    // CITY
    @When("{actor} writes her city {string}")
    public void writeCity(Actor actor, String city) {
        actor.attemptsTo(EnterCustomerData.city(city));
    }

    @Then("{actor} sees her city is {string}")
    public void checkCity(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.city(), equalTo(expected)));
    }

    // STATE
    @When("{actor} writes her state {string}")
    public void writeState(Actor actor, String state) {
        actor.attemptsTo(EnterCustomerData.state(state));
    }

    @Then("{actor} sees her state is {string}")
    public void checkState(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.state(), equalTo(expected)));
    }

    // ZIP
    @When("{actor} writes her zip code {string}")
    public void writeZipCode(Actor actor, String zip) {
        actor.attemptsTo(EnterCustomerData.zip(zip));
    }

    @Then("{actor} sees her zip code is {string}")
    public void checkZip(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.zip(), equalTo(expected)));
    }

    // CARD TYPE (SELECT)
    @When("{actor} selects the card type {string}")
    public void selectCardType(Actor actor, String cardType) {
        actor.attemptsTo(EnterCustomerData.cardType(cardType));
    }

    @Then("{actor} sees the card type is {string}")
    public void checkCardType(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.cardType(), equalTo(expected)));
    }

    // CARD NUMBER
    @When("{actor} writes her credit card number {string}")
    public void writeCreditCard(Actor actor, String number) {
        actor.attemptsTo(EnterCustomerData.cardNumber(number));
    }

    @Then("{actor} sees her credit card number is {string}")
    public void checkCreditCard(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.cardNumber(), equalTo(expected)));
    }

    // MONTH
    @When("{actor} writes the month {string}")
    public void writeMonth(Actor actor, String month) {
        actor.attemptsTo(EnterCustomerData.month(month));
    }

    @Then("{actor} sees the month is {string}")
    public void checkMonth(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.month(), equalTo(expected)));
    }

    // YEAR
    @When("{actor} writes the year {string}")
    public void writeYear(Actor actor, String year) {
        actor.attemptsTo(EnterCustomerData.year(year));
    }

    @Then("{actor} sees the year is {string}")
    public void checkYear(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.year(), equalTo(expected)));
    }

    // CARD NAME + PURCHASE BUTTON AUTO-CLICK
    @When("{actor} writes the name on the credit card {string}")
    public void writeCardName(Actor actor, String name) {
        actor.attemptsTo(EnterCustomerData.cardName(name));

    }

    @Then("{actor} sees the name on the credit card is {string}")
    public void checkCardName(Actor actor, String expected) {
        actor.should(seeThat(TextOfField.cardName(), equalTo(expected)));
    }

    @When("{actor} purchases flights")
    public void purchaseFlights(Actor actor) {
        actor.attemptsTo(PurchaseFlight.now());
    }

}

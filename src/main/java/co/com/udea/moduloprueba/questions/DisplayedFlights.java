package co.com.udea.moduloprueba.questions;

import co.com.udea.moduloprueba.pages.FlightResultsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DisplayedFlights implements Question<List<Map<String, String>>> {

    @Override
    public List<Map<String, String>> answeredBy(Actor actor) {

        List<WebElementFacade> rows =
                FlightResultsPage.FLIGHT_ROWS.resolveAllFor(actor);

        return rows.stream()
                .map(row -> Map.of(
                        "Airline",  normalize(row.findBy(FlightResultsPage.AIRLINE_NAME.getCssOrXPathSelector()).getText()),
                        "Flight #", normalize(row.findBy(FlightResultsPage.FLIGHT_NUMBER.getCssOrXPathSelector()).getText())
                ))
                .collect(Collectors.toList());
    }

    public static DisplayedFlights list() {
        return new DisplayedFlights();
    }

    private String normalize(String text) {
        return text
                .replace("\u00A0", " ")  // convert non-breaking space
                .trim();
    }
}

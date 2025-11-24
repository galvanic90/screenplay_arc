package co.com.udea.moduloprueba.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightBookingPage extends PageObject {
    public static final Target NAME_FIELD =
            Target.the("customer name field")
                    .locatedBy("#inputName");


    public static final Target ADDRESS_FIELD =
            Target.the("address field")
                    .locatedBy("#address");


    public static final Target CITY_FIELD =
            Target.the("city field")
                    .locatedBy("#city");


    public static final Target STATE_FIELD =
            Target.the("state field")
                    .locatedBy("#state");


    public static final Target ZIP_FIELD =
            Target.the("zip code field")
                    .locatedBy("#zipCode");


    public static final Target CARD_TYPE =
            Target.the("card type select")
                    .locatedBy("#cardType");


    public static final Target CARD_NUMBER =
            Target.the("credit card number field")
                    .locatedBy("#creditCardNumber");


    public static final Target MONTH_FIELD =
            Target.the("month field")
                    .locatedBy("#creditCardMonth");


    public static final Target YEAR_FIELD =
            Target.the("year field")
                    .locatedBy("#creditCardYear");


    public static final Target CARD_NAME =
            Target.the("name on card field")
                    .locatedBy("#nameOnCard");

    public static final Target PURCHASE_FLIGHTS = Target.the("Purchase flights").located(By.cssSelector("[type=submit]"));
}

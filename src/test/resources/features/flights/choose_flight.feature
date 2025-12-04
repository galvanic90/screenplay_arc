Feature: Select the flight
   As customer
   I want to select the flight and enter my personal information
   So that I can make the reservation

Scenario: Select the flight
   Given Sara is on home page
   When Sara travels from Boston to Cairo
   And Sara selects the first flight

   When Sara writes her name "Sara Galvan Ortega"
   Then Sara sees that the name is "Sara Galvan Ortega"

   When Sara writes her address "123 Main St."
   Then Sara sees her address is "123 Main St."

   When Sara writes her city "Boston"
   Then Sara sees her city is "Boston"

   When Sara writes her state "Massachusetts"
   Then Sara sees her state is "Massachusetts"

   When Sara writes her zip code "12345"
   Then Sara sees her zip code is "12345"

   When Sara selects the card type "Visa"
   Then Sara sees the card type is "Visa"

   When Sara writes her credit card number "123456"
   Then Sara sees her credit card number is "123456"

   When Sara writes the month "11"
   Then Sara sees the month is "11"

   When Sara writes the year "2017"
   Then Sara sees the year is "2017"

   When Sara writes the name on the credit card "Sara Galvan Ortega"
   Then Sara sees the name on the credit card is "Sara Galvan Ortega"
   When Sara purchases flights
Feature: See the list of flights
   As customer I want to see the list of flights, so I can know the options for my travel

 Scenario: See the list of flights
    Given Sara is on home page
    When Sara travels from Boston to London
    Then the following flights are displayed:
    | Flight # | Airline         |
    |   43     | Virgin America  |
    |   234    | United Airlines |
    |   9696   | Aer Lingus      |
    |   4346   | Lufthansa       |
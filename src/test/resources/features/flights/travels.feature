Feature: Select the flights

 Scenario: Select Origin flight
    Given Sara is on home page
    When Sara travels from Boston to London
    Then the following flights are displayed:
    |Airline| Flight # |
    | Virgin America | 43 |
     | United Airlines | 234 |
     |Aer Lingus      | 9696 |

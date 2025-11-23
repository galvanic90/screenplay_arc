Feature: Travel selection
    As customer I need to select the cities of origin and destination
    for my travel so I can see the flights

Scenario: Select correct travel options
    Given Sara is on home page
    When Sara choose the origin Boston
    Then Sara see that the origin is Boston
    When Sara choose the destination London
    Then Sara see that the destination is London


Feature: ELoyalty Homepage Stepdefinition
  Homepage Functionality Validation

  Scenario: Verify able to launch the eloyalty application
    Given Launch the eloyalty application https://premium.aa.com/eloyalty_enu/
    And Validate user landed in eloyalty homepage

  Scenario: Verify Annual membership description available in eloyalty homepage
    And Validate Annual membership description
      | Annual Membership                                                                             |
      | With an annual membership, you (and up to 2 guests) get access to more than 100 Admirals Club |
      | lounges and partner lounges worldwide.                                                        |
      | Features inside the club include:                                                             |
      | Comfortable chairs to relax                                                                   |
      | Chef-inspired food and drinks                                                                 |
      | Wi-Fi and power ports                                                                         |
      | Personal travel assistance                                                                    |
      | Shower suites (select locations)                                                              |

  Scenario: Verify user able to click Join AAdvantage and visit the enrollment page
    And Click Join AAdvantage
    And Validate user landed in enrollment page

  Scenario: Verify user able to click AAdvantage Number and visit the need your number page
    And Click AAdvantage Number
    And Validate user landed in need your number page

  Scenario: Verify user able to click Password and visit the Need a password Page
    And Click Password
    And Validate user landed in Password page

  #Scenario: Verify user able to click Learn more and visit the Creditcards page
   # And Click Learn more
   # And Validate user landed in Creditcards page

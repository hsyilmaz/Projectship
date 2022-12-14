Feature: Bank Account Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

  Scenario: Add a Bank Account
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | searchInputTwo   | Cey           |
      | ibanInput        | TR12 4578 369 |
      | integrationCode2 | 1745          |

    And Click on the element in the Dialog
      | currency       |
      | currencyselect |
      | saveButton     |

    Then Success message should be displayed

  Scenario: Edit Bank Account
    When Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | searchInputTwo   | ceyhun        |
      | ibanInput        | TR45 1425 365 |
      | integrationCode2 | 4517          |

    And Click on the element in the Dialog
      | currency        |
      | currencyselect2 |
      | saveButton      |

    Then Success message should be displayed

  Scenario: Delete Bank Account
    When Click on the element in the Dialog
      | deleteButton |

    And Click on the element in the Dialog
      | deleteDialogButton |

    Then Success message should be displayed

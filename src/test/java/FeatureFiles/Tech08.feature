Feature: Discount Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | discounts  |

  Scenario:Create a Discount
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | descriptionInput | Musab Sinan |
      | integrationCode  | MSH         |
      | priority         | 35          |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit a Discount
    And User sending the keys in Dialog content
      | searchInputOne | Musab Sinan |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | descriptionInput | Ebuzer Tutuk |
      | integrationCode  | ET           |
      | priority         | 27           |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete a Discount
    And User delete item from Dialog
      | Ebuzer Tutuk |

    Then Success message should be displayed





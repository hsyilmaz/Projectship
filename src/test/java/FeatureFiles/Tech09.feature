Feature: Nationalities Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

  Scenario:Create a Nationality
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | searchInputTwo | group21Mustafa |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit a Nationality
    And User sending the keys in Dialog content
      | searchInputOne | group21Mustafa |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | searchInputTwo | Mustafa21 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete a Nationality
    And User delete item from Dialog
      | Mustafa21 |

    Then Success message should be displayed
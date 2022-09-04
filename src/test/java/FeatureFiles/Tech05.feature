Feature:Position Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a position
    And Click on the element in the left Nav
      | humanResources      |
      | humanResourcesSetup |
      | positions           |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | name_F | zzz1 |
      | code_F | z1   |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed


  Scenario: Edit a position
    And Click on the element in the left Nav
      | humanResources      |
      | humanResourcesSetup |
      | positions           |

    And User sending the keys in Dialog content
      | searchInputOne | zzz1 |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | name_F | zzz2 |
      | code_F | z2   |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete a position
    And Click on the element in the left Nav
      | humanResources      |
      | humanResourcesSetup |
      | positions           |

    And User delete item from Dialog
      | zzz2 |

    Then Success message should be displayed


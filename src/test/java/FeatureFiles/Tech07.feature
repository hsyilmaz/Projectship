Feature: Locations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add School Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | searchInputOne | kaan    |
      | searchInputTwo | koctepe |
      | capacity       | 20      |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit School Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | searchInputOne | bilge   |
      | searchInputTwo | koctepe |
      | capacity       | 30      |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete School Locations
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

    And Click on the element in the Dialog
      | deleteButton       |
      | deleteDialogButton |

    Then Success message should be displayed


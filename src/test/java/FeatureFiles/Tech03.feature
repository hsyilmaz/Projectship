Feature: Document Types Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create a Document Types

    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | documentType |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | searchInputTwo | Mustafa21 |
      | description    | Group21   |


    And Click on the element in the Dialog
      | stageOne   |
      | stageTwo   |
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Document Types
    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | documentType |

    And User sending the keys in Dialog content
      | searchInputOne | Mustafa21 |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | searchInputTwo | GroupYirmiBir |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Document Types
    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | documentType |

    And User delete item from Dailog
      | GroupYirmiBir |


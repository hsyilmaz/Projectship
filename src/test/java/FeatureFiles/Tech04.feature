Feature: Field Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Adding Field
    When Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And Click on the element in the Dialog
      | addButton2 |

    And User sending the keys in Dialog content
      | name_F | Field1 |
      | code_F | 12xy   |

    And Click on the element in the Dialog
      | fieldType |
      | text      |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Editing Field

    When Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And User sending the keys in Dialog content
      | searchInputOne | Field1 |

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | name_F | Field10 |
      | code_F | 12xyz   |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Deleting Field

    When Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And User delete item from Dialog
      | Field10 |

    Then Success message should be displayed


Feature:Departments Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | departments |

  Scenario: Create a departments
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | name_GL    | zzz |
      | shortNm_GL | z1  |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit a departments
    And Click on the element in the Dialog
      | edit_D |

    And User sending the keys in Dialog content
      | name_GL    | zz |
      | shortNm_GL | z2 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete a departments
    And Click on the element in the Dialog
      | delete_D           |
      | deleteDialogButton |

    Then Success message should be displayed
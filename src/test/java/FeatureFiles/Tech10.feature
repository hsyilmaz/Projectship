Feature: Grade Levels Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |

  Scenario: Adding Grade Levels
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | name_GL    | GrLv_Hy |
      | shortNm_GL | GLH1    |
      | order_GL   | 101     |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Editing Grade Levels
    When Click on the element in the Dialog
      | edit_GL |

    And User sending the keys in Dialog content
      | name_GL    | GrLv_Yh |
      | shortNm_GL | GLH2    |
      | order_GL   | 201     |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Deleting Grade Levels
    When Click on the element in the Dialog
      | delete_GL |

    And Click on the element in the Dialog
      | deleteDialogButton |

    Then Success message should be displayed



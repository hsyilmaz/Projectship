Feature: Field Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Adding Editing and Deleting Field
    When Click on the element in the left Nav
      | setupOne |
      | parameters|
      | fields|

    And Click on the element in the Dialog
      | addButton2 |

    And User sending the keys in the Form content
      | name_F | Field1 |
      | code_F | 12xy   |

    And Click on the element in the Form Content
      | fieldType  |
      | text |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dailog
      | Field1|

    Then Success message should be displayed

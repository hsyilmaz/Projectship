Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:Create a Attestations
    And Click on the element in the left Nav
      | humanResources      |
      | humanResourcesSetup |
      | attestations        |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | searchInputTwo | Musab Hacı |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario:Edit a Attestations
    And Click on the element in the left Nav
      | humanResources      |
      | humanResourcesSetup |
      | attestations        |
    And User sending the keys in Dialog content
      | searchInputOne | Musab Hacı |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | searchInputTwo | Musab Hacıgiller |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed


  Scenario:Delete a Attestations
    And Click on the element in the left Nav
      | humanResources      |
      | humanResourcesSetup |
      | attestations        |

    And User delete item from Dailog
      | Musab Hacıgiller |

    Then Success message should be displayed











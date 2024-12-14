Feature: Login Functionality

  Background:
    Given Navigate to magento website
    And Click on the Element in Dialog
      | signIn |

  Scenario: User Login

    And User send keys in Dialog
      | email    | test34@gmail.com |
      | password | As123456         |

    And Click on the Element in Dialog
      | signInButton |

    Then Login Success Message Should Appear

    And Click on the Element in Dialog
      | customerMenuDropDown |
      | signOut              |

    Then Logout Message Should Appear

  Scenario: Failed User Login

    And User send keys in Dialog
      | password | As123456 |

    And Click on the Element in Dialog
      | signInButton |

    Then Required Field Message Should Appear

    And User send keys in Dialog
      | email    | test34@gmail.com1 |
      | password | As123456          |

    And Click on the Element in Dialog
      | signInButton |

    Then Valid Email Address Message Should Appear

    And User send keys in Dialog
      | email | test344@gmail.com |

    And Click on the Element in Dialog
      | signInButton |

    Then Required Field Password Message Should Appear

    And User send keys in Dialog
      | email    | test34@gmail.com |
      | password | As123456789      |

    And Click on the Element in Dialog
      | signInButton |

    Then Invalid Password Message Should Appear

    And Click on the Element in Dialog
      | forgetPasswordButton |

    Then Forget Password Page Should Appear

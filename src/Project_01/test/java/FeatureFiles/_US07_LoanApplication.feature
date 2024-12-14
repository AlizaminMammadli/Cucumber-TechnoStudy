Feature: ParaBank Website Functionality

  Background:
    Given Navigate to ParaBank Website
    And Click on the Element in LeftNav
      | register |
    And User send random keys in Dialog
    And Click on the Element in Dialog
      | registerButton2 |
    Then Message Should be Displayed
      | success |

  Scenario: Loan Application

    And Click on the Element in LeftNav
      | requestLoan |

    And User send keys in Dialog
      | loanAmount  | 1000 |
      | downPayment | 500  |

    And User select the element from Dialog
      | loanSelect | 0 |

    And Click on the Element in Dialog
      | applyNow |

    Then Loan Approved message confirmation

    And Click on the Element in Dialog
      | newAccoutId |

    Then No Transaction message confirmation


  Scenario: Loan Application nagative

    And Click on the Element in LeftNav
      | requestLoan |

    And User send keys in Dialog
      | loanAmount  | 1000 |
      | downPayment | 900  |

    And User select the element from Dialog
      | loanSelect | 0 |

    And Click on the Element in Dialog
      | applyNow |

    Then Loan Denied message confirmation




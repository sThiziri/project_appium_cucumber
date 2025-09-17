Feature: Calcul

  Scenario Outline: Calcul operation
    Given jaccepte les cookies
    When je saisis le premier "<chiffre1>"
    And je saisis loperateur "<operator>"
    And je saisis le premier chiffre "<chiffre2>"
    And je clique sur egale
    Then jobtiens le resultat "<resultat>"

    Examples:
      | chiffre1 | operator | chiffre2 | resultat |
      |        3 | +        |        5 |        8 |
      |        4 | -        |        2 |        2 |
      |        6 | *        |        2 |       12 |

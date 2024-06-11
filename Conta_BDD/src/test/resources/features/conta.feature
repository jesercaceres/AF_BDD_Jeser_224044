Feature: Sistema de Caixa Eletrônico

  Scenario: Cliente especial com saldo negativo solicita saque
    Given um cliente especial com saldo atual de -200 reais
    When for solicitado um saque no valor de 100 reais
    Then deve efetuar o saque e atualizar o saldo da conta para -300 reais

  Scenario: Cliente comum com saldo negativo solicita saque
    Given um cliente comum com saldo atual de -300 reais
    When solicitar um saque de 200 reais
    Then não deve efetuar o saque e deve retornar a mensagem "Saldo Insuficiente"
# AF_BDD_ETAPA2_JESER_224044

![Foto mostrando resultaodo da execução](https://i.imgur.com/2NTVEpk.png)

## Enunciado do Cenário

Você é um cliente de um banco e precisa sacar dinheiro de um caixa eletrônico. Para facilitar essa operação, o sistema do banco foi desenvolvido com diferentes comportamentos, dependendo do tipo de cliente e do saldo em sua conta.

Primeiramente, considere um cliente especial com um saldo negativo de -200 reais. Se esse cliente solicitar um saque de 100 reais, o sistema deve permitir o saque e atualizar o saldo da conta para -300 reais.

Por outro lado, suponha um cliente comum que também possui um saldo negativo, mas de -300 reais. Se esse cliente tentar sacar 200 reais, o sistema não deve permitir o saque e deve retornar a mensagem "Saldo Insuficiente".

Esses cenários ilustram como o sistema do caixa eletrônico responde às solicitações de saque, levando em consideração o tipo de cliente e o saldo disponível em sua conta.

## Gherkin do Cenário

```gherkin
Story: Cliente faz saque de dinheiro
  Como um cliente, eu gostaria de sacar dinheiro em caixa eletrônico, para que eu não tenha que esperar numa fila de banco.

Scenario: Cliente especial com saldo negativo
  Given um cliente especial com saldo atual de -200 reais
  When for solicitado um saque no valor de 100 reais
  Then deve efetuar o saque e atualizar o saldo da conta para -300 reais

Scenario: Cliente comum com saldo negativo
  Given um cliente comum com saldo atual de -300 reais
  When solicitar um saque de 200 reais
  Then não deve efetuar o saque e deve retornar a mensagem "Saldo Insuficiente"
```
## Estrutura do Projeto

### Pacote org.example

- Classe Conta: Representa uma conta bancária com métodos para verificar se a conta é especial, obter e definir o saldo, e realizar saques.
- Classe RunCucumberTest: Executa os testes do Cucumber com TestNG.
- Classe ContaSteps: Define os passos para os testes de comportamento da Conta.

## Documentação

- [Link para o JavaDoc](https://github.com/jesercaceres/AF_BDD_Jeser_224044/tree/CONTA_TESTE/Javadoc)

## Como executar

Para executar os testes apenas execute a classe `RunCucumberTest`.

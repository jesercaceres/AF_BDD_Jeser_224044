package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

/**
 * Classe que define os passos para os testes de comportamento da Conta.
 */
public class ContaSteps {

    private Conta conta;
    private String mensagem;

    public ContaSteps(){}

    /**
     * Define um cliente especial com saldo inicial.
     * @param saldo saldo inicial da conta.
     */
    @Given("um cliente especial com saldo atual de {int} reais")
    public void clienteEspecial(int saldo) {
        conta = new Conta(true, saldo);
    }

    /**
     * Define um cliente comum com saldo inicial.
     * @param saldo saldo inicial da conta.
     */
    @Given("um cliente comum com saldo atual de {int} reais")
    public void clienteComum(int saldo) {
        conta = new Conta(false, saldo);
    }

    /**
     * Solicita um saque na conta.
     * @param valor valor a ser sacado.
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void clienteSolicitaSaque(int valor) {
        mensagem = conta.sacar(valor);
    }

    /**
     * Solicita um saque na conta.
     * @param valor valor a ser sacado.
     */
    @When("solicitar um saque de {int} reais")
    public void solicitar_um_saque_de_reais(Integer valor) {
        mensagem = conta.sacar(valor);
    }

    /**
     * Verifica se o saldo da conta é o esperado.
     * @param saldoEsperado saldo esperado da conta.
     */
    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void saldoDaContaDeveSer(int saldoEsperado) {
        assertEquals(saldoEsperado, conta.getSaldo());
    }

    /**
     * Verifica se a mensagem retornada pelo sistema é a esperada.
     * @param mensagemEsperada mensagem esperada.
     */
    @Then("não deve efetuar o saque e deve retornar a mensagem {string}")
    public void sistemaRetornaMensagem(String mensagemEsperada) {
        assertEquals(mensagemEsperada, mensagem);
    }
}
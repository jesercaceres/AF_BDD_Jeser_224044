package org.example;

/**
 * Classe que representa uma conta bancária.
 */
public class Conta {
    private boolean especial;
    private int saldo;

    public Conta(){}

    /**
     * Construtor da classe Conta.
     * @param especial indica se a conta é especial.
     * @param saldo saldo inicial da conta.
     */
    public Conta(boolean especial, int saldo) {
        this.especial = especial;
        this.saldo = saldo;
    }

    /**
     * Verifica se a conta é especial.
     * @return true se a conta é especial, false caso contrário.
     */
    public boolean isEspecial() {
        return especial;
    }

    /**
     * Define se a conta é especial.
     * @param especial true para definir a conta como especial, false caso contrário.
     */
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    /**
     * Obtém o saldo da conta.
     * @return o saldo da conta.
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Define o saldo da conta.
     * @param saldo o novo saldo da conta.
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para realizar saque na conta.
     * @param valor valor a ser sacado.
     * @return mensagem de erro caso o saque não seja permitido, ou null se o saque for permitido.
     */
    public String sacar(int valor) {
        if (especial || saldo - valor >= -300) {
            saldo -= valor;
            return null;
        } else {
            return "Saldo Insuficiente";
        }
    }
}
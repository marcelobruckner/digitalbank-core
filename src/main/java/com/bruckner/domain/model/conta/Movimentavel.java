package com.bruckner.domain.model.conta;

public interface Movimentavel {

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}

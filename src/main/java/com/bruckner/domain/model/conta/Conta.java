package com.bruckner.domain.model.conta;

import com.bruckner.domain.model.cliente.Cliente;
import com.bruckner.domain.model.exception.BancoException;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public abstract class Conta implements Movimentavel {
    private static int AGENCIA_DIGITAL = 100;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_DIGITAL;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("******* " + LocalDateTime.now().format(dateFormat) + " *******");
        System.out.println(this);
        System.out.println("");
    }

    @Override
    public void depositar(double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }

    @Override
    public void sacar(double valorSaque) throws BancoException {
        if (saldo < valorSaque) {
            throw new BancoException("Saldo insuficiente");
        }
        this.saldo = this.saldo - valorSaque;
    }

    @Override
    public void transferir(double valorTransferencia, Conta contaDestino) {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
    }

}

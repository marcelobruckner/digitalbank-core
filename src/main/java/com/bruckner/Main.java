package com.bruckner;

import com.bruckner.domain.model.banco.Banco;
import com.bruckner.domain.model.conta.Conta;
import com.bruckner.domain.model.exception.BancoException;

public class Main {
    public static void main(String[] args) {

        // abrirNovaContaCorrenteEDepositar();
        // abrirNovaContaPoupancaEDepositar();
        // transferirDinheiroDeContaCorrenteParaPoupanca();
        realizarSaqueComSaldoInsuficiente();
    }

    private static void abrirNovaContaPoupancaEDepositar() {
        Conta conta = Banco.abrirNovaContaPoupancaPessoaFisica("Luis Marcelo", "012.345.678-90");
        conta.depositar(600);
        conta.imprimirExtrato();
    }

    private static void abrirNovaContaCorrenteEDepositar() {
        Conta conta = Banco.abrirContaCorrentePessoaFisica("Luis Marcelo", "012.345.678-90");
        conta.depositar(350);
        conta.imprimirExtrato();
    }

    private static void transferirDinheiroDeContaCorrenteParaPoupanca() {
        Conta cc = Banco.abrirContaCorrentePessoaFisica("Luis Marcelo", "012.345.678-90");
        Conta cp = Banco.abrirNovaContaPoupancaPessoaFisica("Luis Marcelo", "012.345.678-90");
        cc.depositar(150);
        try {
            cc.transferir(250, cp);
        } catch (BancoException e) {
            System.out.println("Não e possivel realizar a operacao, saldo insuficiente");
        }

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

    private static void realizarSaqueComSaldoInsuficiente() {
        Conta cc = Banco.abrirContaCorrentePessoaFisica("Luis Marcelo", "012.345.678-90");
        // cc.depositar(200);
        try {
            cc.sacar(201);
        } catch (BancoException e) {
            System.out.println("Não e possivel realizar a operacao, saldo insuficiente");
        }

        cc.imprimirExtrato();
    }

}
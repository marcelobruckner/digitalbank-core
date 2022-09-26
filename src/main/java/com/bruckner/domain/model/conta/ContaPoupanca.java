package com.bruckner.domain.model.conta;

import com.bruckner.domain.model.cliente.Cliente;

public class ContaPoupanca extends Conta {
    private TipoConta tipoConta;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.tipoConta = TipoConta.CONTA_POUPANCA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaPoupanca{");
        sb.append("tipoConta=").append(tipoConta);
        sb.append(", cliente=").append(cliente);
        sb.append(", agencia=").append(agencia);
        sb.append(", numero=").append(numero);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("******* EXTRATO DE "+ this.tipoConta + " *******");
        super.imprimirExtrato();
    }
}

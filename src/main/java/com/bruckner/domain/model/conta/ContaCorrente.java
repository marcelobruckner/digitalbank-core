package com.bruckner.domain.model.conta;

import com.bruckner.domain.model.cliente.Cliente;

import lombok.Getter;

@Getter
public class ContaCorrente extends Conta {
    private TipoConta tipoConta;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.tipoConta = TipoConta.CONTA_CORRENTE;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaCorrente{");
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
        System.out.println("******* EXTRATO DE " + this.tipoConta + " *******");
        super.imprimirExtrato();
    }
}

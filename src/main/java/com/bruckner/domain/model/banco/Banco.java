package com.bruckner.domain.model.banco;

import java.util.HashMap;
import java.util.Map;

import com.bruckner.domain.model.cliente.Cliente;
import com.bruckner.domain.model.cliente.ClientePessoaFisica;
import com.bruckner.domain.model.conta.Conta;
import com.bruckner.domain.model.conta.ContaCorrente;
import com.bruckner.domain.model.conta.ContaPoupanca;

public class Banco {

    private static Map<Integer, Conta> todasAsContas = new HashMap<>();

    public static Conta abrirContaCorrentePessoaFisica(String nome, String cpf) {
        Cliente cliente = new ClientePessoaFisica(nome, cpf);
        Conta cc = new ContaCorrente(cliente);
        todasAsContas.put(cc.getNumero(), cc);

        return cc;
    }

    public static Conta abrirNovaContaPoupancaPessoaFisica(String nome, String cpf) {
        Cliente cliente = new ClientePessoaFisica(nome, cpf);
        Conta cc = new ContaPoupanca(cliente);
        todasAsContas.put(cc.getNumero(), cc);

        return cc;
    }

    public static Conta obterConta(Integer id) {
        return todasAsContas.get(id);
    }

    public static void listarTodasAsContas() {
        System.out.println(todasAsContas.toString());
    }

}

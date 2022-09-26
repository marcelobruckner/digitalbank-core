package com.bruckner.domain.model.cliente;

import lombok.Getter;

@Getter
public class ClientePessoaFisica extends Cliente {
    private String cpf;

    public ClientePessoaFisica(String nome, String cpf) {
        this.cpf = cpf;
        super.nome = nome;
        super.tipoPessoa = TipoPessoa.PESSOA_FISICA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientePessoaFisica{");
        sb.append("cpf='").append(cpf).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", tipoPessoa=").append(tipoPessoa);
        sb.append('}');
        return sb.toString();
    }
}

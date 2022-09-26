package com.bruckner.domain.model.cliente;

import lombok.Getter;

@Getter
public class ClientePessoaJuridica extends Cliente {
    private String cnpj;

    public ClientePessoaJuridica(String nome, String cnpj) {
        this.cnpj = cnpj;
        super.nome = nome;
        super.tipoPessoa = TipoPessoa.PESSOA_JURIDICA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientePessoaJuridica{");
        sb.append("cnpj='").append(cnpj).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", tipoPessoa=").append(tipoPessoa);
        sb.append('}');
        return sb.toString();
    }
}

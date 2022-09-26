package com.bruckner.domain.model.cliente;

import lombok.Getter;

@Getter
public enum TipoPessoa {

    PESSOA_FISICA("PF"),
    PESSOA_JURIDICA("PJ");

    private String tipo;

    TipoPessoa(String tipo) {
        this.tipo = tipo;
    }
}

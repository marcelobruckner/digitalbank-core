package com.bruckner.domain.model.conta;

import lombok.Getter;

@Getter
public enum TipoConta {
    CONTA_CORRENTE("CONTA CORRENTE"),
    CONTA_POUPANCA("CONTA POUPANCA");

    private String tipo;

    TipoConta(String tipo) {
        this.tipo = tipo;
    }
}

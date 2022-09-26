package com.bruckner.domain.model.cliente;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public abstract class Cliente {
    protected String nome;
    protected TipoPessoa tipoPessoa;
    private static Map<String, Cliente> clientes = new HashMap<>();
}

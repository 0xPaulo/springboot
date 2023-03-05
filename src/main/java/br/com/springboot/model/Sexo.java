package br.com.springboot.model;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININE("Feminino");

    private String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }
}

package com.example.fabricio.finalproject;

/**
 * Created by Fabricio on 28/12/2017.
 */

public class Bebidas {
    private String nome;
    private String descricao;
    private double valor;

    public Bebidas(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nCerveja: " + nome +
                "\nDescrição: " + descricao +
                "\nValor: " + valor;
    }
}

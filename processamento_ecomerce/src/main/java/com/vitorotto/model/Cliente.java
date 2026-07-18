package com.vitorotto.model;

import java.time.LocalDate;

public class Cliente {

    public enum Tipo {
        VIP,
        COMUM
    }

    private final int id;
    private String nome;
    private Tipo tipo;
    private String cidade;
    private String estado;
    private LocalDate dataCadastro;

    public Cliente(int id, String nome, Tipo tipo, String cidade, String estado, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.cidade = cidade;
        this.estado = estado;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", cidade=" + cidade + ", estado=" + estado
                + ", dataCadastro=" + dataCadastro + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id != other.id)
            return false;
        return true;
    }

}

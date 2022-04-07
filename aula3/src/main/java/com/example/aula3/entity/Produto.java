package com.example.aula3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(length = 100)
    private String nome;
    private int qtdProduto;
    @ManyToOne
    @JoinColumn(name="categoria_id")
    private CategoriaProduto idCategoria;

    public Produto() {
    }

    public Produto(int id, String nome, int qtdProduto) {
        this.id = id;
        this.nome = nome;
        this.qtdProduto = qtdProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public CategoriaProduto getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaProduto idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", idCategoria=" + idCategoria + ", nome=" + nome + ", qtdProduto=" + qtdProduto
                + "]";
    }
}

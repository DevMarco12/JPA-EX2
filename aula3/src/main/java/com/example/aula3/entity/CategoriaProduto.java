package com.example.aula3.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_catProduto")
public class CategoriaProduto {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int idCategoria;
    @Column(length = 100)
    private String nome;
    private String catDescricao;
    @OneToMany(mappedBy = "idCategoria")
    private List<Produto> produtos;

    public CategoriaProduto() {
    }

    public CategoriaProduto(int idCategoria, String nome, String catDescricao) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.catDescricao = catDescricao;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCatDescricao() {
        return catDescricao;
    }

    public void setCatDescricao(String catDescricao) {
        this.catDescricao = catDescricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}

package com.example.aula3.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.Entity;

@Entity 
@Table(name = "rb_perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String nome;
    @OneToMany(mappedBy = "perfil")
    private List<Usuario> usuario;

    public Perfil(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Perfil() {
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
    public List<Usuario> getUsuario() {
        return usuario;
    }
    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
    
}

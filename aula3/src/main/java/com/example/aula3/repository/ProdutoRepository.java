package com.example.aula3.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.example.aula3.entity.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {
    @Autowired
    private EntityManager entityManager;

    // Método insert no JPA
    @Transactional
    public Produto inserir(Produto produto) {
        entityManager.persist(produto);
        return produto;
    }

    // Método update no JPA
    @Transactional
    public Produto atualizar(Produto produto) {
        entityManager.merge(produto);
        return produto;
    }

    // Método delete no JPA
    @Transactional
    public void excluir(Produto produto) {
        entityManager.remove(produto);
    }

    // Método que retorna uma lista de produtos com o nome parâmetrizado
    @Transactional
    public Produto obterPorId(int id) {
        String jpql = "select u from Produto u where u.id = :id";
        TypedQuery<Produto> query = entityManager.createQuery(jpql, Produto.class);

        query.setParameter("id", id);
        return query.getSingleResult();
    }

    // Método excluir
    @Transactional
    public void excluir(int id) {
        excluir(entityManager.find(Produto.class, id));
    }

    // Método get all no JPA
    public List<Produto> obterTodos() {
        return entityManager.createQuery("from Produto", Produto.class).getResultList();
    }

}

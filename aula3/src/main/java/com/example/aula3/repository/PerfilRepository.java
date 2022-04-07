package com.example.aula3.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.aula3.entity.Perfil;
@Repository
public class PerfilRepository {
    @Autowired
    private EntityManager entityManager; 

    @Transactional
    public Perfil inserir(Perfil perfil){
        entityManager.persist(perfil);
        return perfil;
    }
}

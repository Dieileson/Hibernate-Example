package com.exemplo.hibernate.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.exemplo.hibernate.model.entity.BaseEntity;

public class BaseDAO {

    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public BaseDAO() {
        /* Carregando configurações do arquivo persistence.xml */
        this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_hibernate");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

    //Save entity
    public void save(BaseEntity entity) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(entity);
        this.entityManager.getTransaction().commit();
    }

    // Alter entity
    public void alter(BaseEntity entity) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(entity);
        this.entityManager.getTransaction().commit();
    }

    //Search by Id
    public Object getEntity(BaseEntity entity) {
        return this.entityManager.find(entity.getClass(), entity.getCodigo());
    }

    //Delete by Id
    public void delete(BaseEntity entity) {
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(entity);
        this.entityManager.getTransaction().commit();

    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}

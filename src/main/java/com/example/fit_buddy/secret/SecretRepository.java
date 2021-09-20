package com.example.fit_buddy.secret;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class SecretRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Secret secret){
        em.persist(secret);
    }
}

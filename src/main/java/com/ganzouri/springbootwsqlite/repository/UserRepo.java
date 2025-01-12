package com.ganzouri.springbootwsqlite.repository;

import com.ganzouri.springbootwsqlite.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {
    final EntityManager entityManager;

    @Autowired
    public UserRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }
}

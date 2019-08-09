package com.itheima.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static EntityManagerFactory entityManagerFactory;

    static{
        entityManagerFactory = Persistence.createEntityManagerFactory("mysqlJPA");
    }

    public static EntityManager getEntityManager(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return  entityManager;
    }
}

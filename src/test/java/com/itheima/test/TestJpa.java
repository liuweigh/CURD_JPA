package com.itheima.test;

import com.itheima.po.Customer;
import com.itheima.utils.JpaUtil;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestJpa {

    @Test
    public void testAdd() {
//        1、创建持久化类管理器工厂 （相当于链接池）
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysqlJPA");
//        2、创建持久化类管理器          （相当于数据库链接）,EntityManager 核心类，封装所有操作数据库的方法
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        3、获取事务对象，并开启事务
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
//        4、业务操作
        //保存客户信息
        Customer customer = new Customer();
        customer.setCustName("阿宪集团");
        customer.setCustLevel("VIPP");
        customer.setCustPhone("13888888888");
        entityManager.persist(customer);
//        5、提交事务
        transaction.commit();
//        6、关闭资源
        entityManager.close();
    }

    /**
     * 查询一条数据
     */
    @Test
    public void getOne() {
        EntityManager entityManager = JpaUtil.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        //查询
        Customer customer = entityManager.find(Customer.class, 1L);
        System.out.println(customer.getCustName());
        transaction.commit();
        entityManager.close();
    }

    /**
     * 更新
     */
    @Test
    public void testUpdate() {
        EntityManager entityManager = JpaUtil.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Customer customer = entityManager.find(Customer.class, 1L);
        customer.setCustName("阿宪美容集团");
        entityManager.merge(customer);

        transaction.commit();
        entityManager.close();
    }

    /**
     * 删除
     */
    @Test
    public void testDelete() {
        EntityManager entityManager = JpaUtil.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Customer customer = entityManager.find(Customer.class, 1L);
        entityManager.remove(customer);
        transaction.commit();
        entityManager.close();
    }


}

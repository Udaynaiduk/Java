package org.example;

import org.Models.departments;
import org.Models.employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(departments.class);
        configuration.addAnnotatedClass(employees.class);

        departments departments=new departments("Admin");
        employees employees=new employees("Uday",departments);
        employees employees1=new employees("Venktesh",departments);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(employees);
        session.save(employees1);
        transaction.commit();
        session.close();
        sessionFactory.close();


    }
}
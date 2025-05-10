package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.models.user_profiles;
import org.models.users;

import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(users.class);
        configuration.addAnnotatedClass(user_profiles.class);
        users users=new users("Kommineedi");
        //use this if data already there
        // users.setId(7);
       // users.setUsername("Uday Kommineedi");
        user_profiles userProfiles=new user_profiles("FSDC",users);
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        System.out.println("One-to-One Relationship Model: If the user already exists, " +
                "it will update the username; otherwise, " +
                "a new user will be added automatically due to cascading.");
        System.out.println("OneToOne Relationship Each record in Table A is associated with " +
                "one and only one record in Table B," +
                " and vice versa.");
        session.save(userProfiles);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Data Added Sucessfully");

        }
    }

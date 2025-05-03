package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");

            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            cfg.addAnnotatedClass(Table_1.class);

            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();

            // ✅ Begin transaction
            session.beginTransaction();

            // ✅ Save entity
            Table_1 table1 = new Table_1("uday", 2);
            session.save(table1);

            // ✅ Commit transaction
            session.getTransaction().commit();

            // ✅ Close session
            session.close();
            sessionFactory.close();

            System.out.println("Data inserted successfully.");

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

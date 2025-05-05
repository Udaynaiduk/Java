package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

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
           Transaction transaction=session.beginTransaction();

            // ✅ Save entity
           // Table_1 table1 = new Table_1("sai", 1); //Without Auto increment ID or for update the existing column
            Table_1 table1 = new Table_1();
            table1.setName("Uday");
            //Table_1 Deltedata = new Table_1("uday", 3);
            // ✅ Save or Update entity session.saveOrUpdate(table1); or  session.merge(table1);
            session.merge(table1);

            //Get data
           Table_1 tabledata=session.get(Table_1.class,1);
           Table_1 tabledata1=session.load(Table_1.class,1);

           //HQL
          Query query= session.createQuery("from Table_1");
          System.out.println("query data"+query.list());

          //NativeQuery
            NativeQuery<Table_1> query2 = session.createNativeQuery("SELECT * FROM MyTable", Table_1.class);
            List<Table_1> resultList = query2.getResultList();

            for (Table_1 l : resultList) {
                System.out.println("Native Query Result: " + l);
            }


            System.out.println(tabledata+" "+tabledata1);
           // Delete Data  session.remove(Deltedata); or session.delete(Deltedata);
           // session.remove(Deltedata);

            // ✅ Commit transaction
            //session.getTransaction().commit();
            transaction.commit();

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

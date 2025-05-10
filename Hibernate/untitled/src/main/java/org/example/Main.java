package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            Connection connection= DriverManager.getConnection("jdbc:sqlserver://INL-9SHCPL3\\SQL2022EXPRESS;databaseName=Test1;encrypt=true;trustServerCertificate=true","sa","Password@123");
           Statement statement= connection.createStatement();
           String sql="Select * from emp";
          ResultSet resultSet=statement.executeQuery(sql);
            ResultSetMetaData metaData=resultSet.getMetaData();
          int columnCount=metaData.getColumnCount();
            // ✅ Print column data
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + resultSet.getString(i) + "\t");
                }
                System.out.println();
            }

          Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            cfg.addAnnotatedClass(Table_1.class);
            cfg.addAnnotatedClass(Emp.class);
            cfg.addAnnotatedClass(School.class);
            cfg.addAnnotatedClass(Student.class);
            cfg.addAnnotatedClass(Passport.class);
            cfg.addAnnotatedClass(StudentPassort.class);

            School s = new School("Kakatiya School", "Nandigama");
            Passport passport=new Passport();
            passport.setPassortNo(2);
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();

            // ✅ Begin transaction
           Transaction transaction=session.beginTransaction();

           Emp emp1=new Emp();
           Address address1=new Address();
           address1.setDo_no(1);
           address1.setSteet("Anasagaram");
           emp1.setAddress(address1);
           emp1.setName("Uday");
           session.merge(emp1);
            // ✅ Save entity
           // Table_1 table1 = new Table_1("sai", 1); //Without Auto increment ID or for update the existing column
            Table_1 table1 = new Table_1();
            table1.setName("Uday");

            //ManyToOne
            //School s = new School("Kakatiya School", "Nandigama");
            //if we use cascade in child table student no need to call this  session.save(s);
            School s2 = new School("jaya siddhartha School", "Nandigama");
            session.save(s2);

            Student student = new Student("Uday", "10th", s);
            Student student2 = new Student("Venkatesh", "9th", s2);
            session.save(student);
            session.save(student2);

            StudentPassort studentPassort=new StudentPassort("Venkatesh","8th",passport);
           // StudentPassort studentPassort2=new StudentPassort("Uday","10t",passport);
            //Cascade and Save
            session.save(studentPassort);
            //session.save(studentPassort2);

            //Table_1 Deltedata = new Table_1("uday", 3);
            // ✅ Save or Update entity session.saveOrUpdate(table1); or  session.merge(table1);
              session.merge(table1);

            //Get data
           //Table_1 tabledata=session.get(Table_1.class,1);
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


            System.out.println(tabledata1);
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

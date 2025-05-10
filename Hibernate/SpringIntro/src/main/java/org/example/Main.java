package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");

         System.out.println("Configloaded Succesfully");
          Sim jio=applicationContext.getBean("Jio",Sim.class);
          jio.Calling();
          jio.data();
          Student student=applicationContext.getBean("st",Student.class);
          System.out.println(student.id+" "+student.name+" "+student.address.dono+" "+student.address.City+" hostel :"+student.hostel.name+" "+"lattiude:"+student.address.gps.lattidues);

         // Student student1=applicationContext.getBean("st2",Student.class);
         // System.out.println(student1.id+ " "+student1.name+" "+student1.address.dono+" "+student1.address.City);
        Student student3=applicationContext.getBean("st3",Student.class);
        System.out.println("ByName"+student3.name+" "+student3.address.dono);

        Student st4=applicationContext.getBean("st4",Student.class);
        System.out.println("Autowire Constructer Bean "+ st4.mess.messname);

        Student st5=applicationContext.getBean("st5",Student.class);
        System.out.println("Auto Wired "+st5.mess.messname);

        }


        }

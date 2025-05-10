package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");

        Student student=applicationContext.getBean("Student",Student.class);

        System.out.println(student.name+" "+student.address.Dono+" "+student.address.City);

        properties properties=applicationContext.getBean("autoproperties", org.example.properties.class);
       System.out.println(properties.name+" "+ properties.id);

      // component component=applicationContext.getBean("component", org.example.component.class);

       //System.out.println("if name not deifined for @Component need to use class name" +component.id);

        component component=applicationContext.getBean("com", org.example.component.class);
        System.out.println("if name deifined for @Component(\"com\") need to use class name" +component.id);

        ApplicationContext AnnotationCongig=new org.springframework.context.annotation.AnnotationConfigApplicationContext(config.class);

        component component1=AnnotationCongig.getBean("com", org.example.component.class);
        System.out.println("AnnotationConfigApplicationContext "+component1.id);


        }
    }

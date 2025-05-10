package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        EmpDto empDto=applicationContext.getBean("product",EmpDto.class);
        Emp emp=new Emp("Uday Kommineed",35,"Anasagaram");
        //empDto.insertEmp(emp);
        List<Emp>  Emp=empDto.GetAllEmpData();
        System.out.println(Emp);
        Emp empUpdate=new Emp(1,"Uday Kommineed",35,"Nandigama");
        empDto.UpdateEmp(empUpdate);
        Emp emp1=empDto.getEmpData(1);
        System.out.println(emp1);
        empDto.DeleteEmp(empUpdate);
        empDto.DeleteById(90);


    }
}
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        DataSource dataSource=applicationContext.getBean("datasource",DataSource.class);
        JdbcTemplate jdbcTemplate=applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
        System.out.println(jdbcTemplate.toString());
        jdbcTemplate.execute("update Emp set Name='udaya bhaskar' where EmpId=1");
        int update=jdbcTemplate.update("INSERT INTO EMP VALUES (62,'Venkatesh','anasagaram')");
        System.out.println(update);
        String sql1="INSERT INTO EMP VALUES (62,'Venkatesh','anasagaram')";
        String sql2="INSERT INTO EMP VALUES (73,'Sai','Nandigama')";


      int[] rowseffected=jdbcTemplate.batchUpdate(sql1,sql2);
      System.out.println(Arrays.toString(rowseffected));

      EMP emp=jdbcTemplate.queryForObject("Select * from Emp where EmpId=1",new EmpMapper());
        System.out.println(emp);
        List<EMP> resultSet=jdbcTemplate.query("Select * from Emp",new EmpMapper());

        System.out.println(resultSet);

        Object[] inputargs={62,"Kommineedi","anasagaram"};
        int arugupdate=jdbcTemplate.update("INSERT INTO EMP VALUES (?,?,?)",inputargs);
        System.out.println(arugupdate);
        Object[] inputargs1={56};
        EMP resultSet1=jdbcTemplate.queryForObject("Select * from Emp where EmpId=?",inputargs1,new EmpMapper());

        System.out.println(resultSet1);


        ApplicationContext applicationContext1=new AnnotationConfigApplicationContext(config.class);
        JdbcTemplate JdbcTemplate1=applicationContext1.getBean("jdbcTemplate",JdbcTemplate.class);

        int update4=JdbcTemplate1.update("update Emp set Name='udayabhaskar Kommineedi' where EmpId=1");
        System.out.println(update4);

    }
}
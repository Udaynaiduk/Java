package org.example;

import java.util.List;

public interface EmpDto {

     int insertEmp(Emp emp);
     Emp getEmpData(int id);
     List<Emp> GetAllEmpData();
     int UpdateEmp(Emp emp);

     int DeleteEmp(Emp emp);
     int DeleteById(int id);


}

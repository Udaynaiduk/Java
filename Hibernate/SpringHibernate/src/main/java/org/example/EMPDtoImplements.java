package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component("product")
public  class EMPDtoImplements implements EmpDto{

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int insertEmp(Emp emp) {
       hibernateTemplate.saveOrUpdate(emp);
       return 1;
    }

    @Override
    public Emp getEmpData(int id) {
       return hibernateTemplate.get(Emp.class,id);
    }

    @Override
    public List<Emp> GetAllEmpData() {
        return hibernateTemplate.loadAll(Emp.class);
    }

    @Transactional
    @Override
    public int UpdateEmp(Emp emp) {
         hibernateTemplate.update(emp);
         return 1;
    }

    @Transactional
    @Override
    public int DeleteEmp(Emp emp) {
       hibernateTemplate.delete(emp);
       return 1;
    }

    @Override
    @Transactional
    public int DeleteById(int id){
       Emp emp=hibernateTemplate.get(Emp.class,id);
       if(emp!=null){
           hibernateTemplate.delete(emp);
           return 1;
       }
        return 0;
    }
}

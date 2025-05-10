package org.example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpMapper implements RowMapper<EMP> {

    @Override
    public EMP mapRow(ResultSet rs, int rowNum) throws SQLException {
       EMP emp= new EMP();
       emp.setEmpId(rs.getInt(2));
       emp.setName(rs.getString(3));
       emp.setSteet(rs.getString(4));
       return emp;


    }
}

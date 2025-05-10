package org.example;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource(value = "classpath:app.properties")
public class config {

    @Bean("DataSoruce")
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:sqlserver://INL-9SHCPL3\\SQL2022EXPRESS;databaseName=Test1;encrypt=true;trustServerCertificate=true");
        ds.setUsername("sa");
        ds.setPassword("Password@123");
        return ds;
    }


    @Bean("jdbcTemplate")
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }
}

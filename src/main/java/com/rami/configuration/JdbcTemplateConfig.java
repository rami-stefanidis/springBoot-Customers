package com.rami.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by Rami Stefanidis on 6/18/2017.
 */
@Configuration
public class JdbcTemplateConfig {

    @Autowired
    @Qualifier("clientDataDatasource")
    private DataSource clientDataDataSource;

    @Bean(name = "clientDataJdbcTemplate")
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(clientDataDataSource);
    }
}

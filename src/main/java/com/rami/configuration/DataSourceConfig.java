package com.rami.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * Created by Rami Stefanidis on 6/18/2017.
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "clientDataDatasource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

}

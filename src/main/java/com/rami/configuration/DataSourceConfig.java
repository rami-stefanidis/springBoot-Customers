package com.rami.configuration;

import com.rami.annotations.UseClientDataDatasource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * Created by Rami Stefanidis on 6/18/2017.
 */

@Configuration
@MapperScan(basePackages = "com.rami.dao",annotationClass = UseClientDataDatasource.class)
public class DataSourceConfig {

    @Bean(name = "clientDataDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.client_data")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

}

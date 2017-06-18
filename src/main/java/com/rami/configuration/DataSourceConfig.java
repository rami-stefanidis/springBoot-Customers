package com.rami.configuration;

import com.rami.annotations.UseClientDataDatasource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * Created by Rami Stefanidis on 6/18/2017.
 */

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.rami.dao",annotationClass = UseClientDataDatasource.class)
public class DataSourceConfig {

    @Bean(name = "clientDataDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.client_data")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }


    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

}

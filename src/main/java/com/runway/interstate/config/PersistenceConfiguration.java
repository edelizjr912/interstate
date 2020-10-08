package com.runway.interstate.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.awt.*;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource(){
       DataSourceBuilder builder = DataSourceBuilder.create();
       builder.url("jdbc:postgresql://localhost:5433/FirstSpringBoot");
       builder.username("postgres");
       builder.password("password");
       System.out.println("I made it to the custom datasource");
       return builder.build();
    }
}

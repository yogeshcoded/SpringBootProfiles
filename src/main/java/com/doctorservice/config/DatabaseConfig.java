/*

package com.doctorservice.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Objects;


@Configuration
@PropertySource(value = { "classpath:application-${spring.profiles.active}.yml" })
@RequiredArgsConstructor
public class DatabaseConfig {
    private final Environment environment;


    @Bean
    @Profile({"dev","prod"})
    public DataSource hikariDataSource() {

        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
        dataSource.setJdbcUrl(environment.getProperty("spring.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
        dataSource.setMaximumPoolSize(Integer.parseInt(Objects.requireNonNull(environment.getProperty("spring.datasource.maxPool-size"))));
        dataSource.setMinimumIdle(Integer.parseInt(Objects.requireNonNull(environment.getProperty("spring.datasource.minIdle"))));
        return dataSource;
    }
}
*/

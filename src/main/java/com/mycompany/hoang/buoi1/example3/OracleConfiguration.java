package com.mycompany.hoang.buoi1.example3;

import com.mycompany.hoang.buoi1.Oracle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OracleConfiguration {
    @Bean
    public Oracle oracle() {
        return new BookwormOracle();
    }
}

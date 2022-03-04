package com.mycompany.hoang.buoi2.example5;

import com.mycompany.hoang.buoi2.Weapon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeaponConfiguration {
    @Bean
    public Weapon shield() {
        return new Shield();
    }

    @Bean
    public ShieldKnight knight_shield() {
        return new ShieldKnight("Ariana Grande", shield());
    }
}

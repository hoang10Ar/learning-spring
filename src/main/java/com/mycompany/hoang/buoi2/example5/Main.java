package com.mycompany.hoang.buoi2.example5;

/*
+ Using only a JAVA CLASS to configure

+ Using CONSTRUCTOR INJECTION
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(WeaponConfiguration.class);

        ShieldKnight shieldKnight = context.getBean("knight_shield", ShieldKnight.class);
        System.out.println(shieldKnight);
    }
}

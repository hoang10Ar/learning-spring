package com.mycompany.hoang.buoi2.example4;

/*
+ Using ANNOTATIONs to configure: add an @Autowired annotation to the
  constructor method, Spring will discover those @Autowired annotation
  and inject the dependency as required

+ Using CONSTRUCTOR INJECTION

+ XML file:
  <context:component-scan base-package="com.mycompany.hoang.buoi2.example4"/>

+ ShieldKnight class:
    @Autowired
    public ShieldKnight(@Value("Gra") String name, Weapon shield) {
        this.name = name;
        this.weapon = shield;
    }
*/

import com.mycompany.hoang.buoi2.Weapon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("buoi2/buoi2_example4.xml");

        Weapon weapon = (Weapon) context.getBean("shield");
        System.out.println(weapon.getType());

        ShieldKnight shieldKnight = context.getBean("knight_shield", ShieldKnight.class);
        System.out.println(shieldKnight);
    }
}

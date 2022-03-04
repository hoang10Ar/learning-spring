package com.mycompany.hoang.buoi2.example3;

/*
+ Using ANNOTATIONs to configure: add an @Autowired annotation to the
  setter method, Spring will discover those @Autowired annotation and
  inject the dependency as required

+ Using SETTER INJECTION -> classes need to declare default constructor

+ Some annotations:
  _ @Autowire: add this annotation to the setter method of a property
    which you want Spring to auto inject this dependency. When you
    first create an instance of this class, Spring will scan all its
    property and auto find the approriate bean and inject it via its
    setter method. You don't need to declare what object will be injected
    (don't need to declare "ref = ?"), just annotate the setter method
    with @Autowire, Spring will find the suit object and inject it.
    Spring find object (bean) has the same type (class type) with your
    parameter type. If Spring find many objects have same type, Spring
    will find object (bean) has the same name with your parameter name.
    If Spring can't find any object byName, Spring will throw exception.
    @Autowire is use for class type, not for primative and Spring type
  _ @Value: define the value (String, int,...) to be injected into
    setter method (== @Autowire an primitive value)

+ XML file:
  <context:component-scan base-package="com.mycompany.hoang.buoi2.example3"/>

+ ShieldKnight class:
    @Autowired
    public void setWeapon(Weapon shield) {
        this.weapon = shield;
    }

    @Value("Grande")
    public void setName(String name) {
        this.name = name;
    }
*/

import com.mycompany.hoang.buoi2.Weapon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("buoi2/buoi2_example3.xml");

        Weapon weapon = (Weapon) context.getBean("shield");
        System.out.println(weapon.getType());

        ShieldKnight shieldKnight = context.getBean("knight_shield", ShieldKnight.class);
        System.out.println("shieldKnight: " + shieldKnight);
    }
}

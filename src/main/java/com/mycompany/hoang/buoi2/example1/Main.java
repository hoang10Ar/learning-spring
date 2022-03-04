package com.mycompany.hoang.buoi2.example1;

/*
+ Using only XML FILE to configure

+ Using SETTER INJECTION -> classes need to declare default constructor

+ XML file:
  <bean id="sword" class="com.mycompany.hoang.buoi2.example1.Sword"/>

  <bean id="knight_sword" class="com.mycompany.hoang.buoi2.Knight">
      <property name="name" value="Ariana"/>
      <property name="weapon" ref="sword"/>
  </bean>

  <bean id="knight_unique_sword" class="com.mycompany.hoang.buoi2.Knight">
      <property name="name" value="Ariana"/>
      <property name="weapon">
          <bean class="com.mycompany.hoang.buoi2.example1.Sword"/>
      </property>
  </bean>

+ Explain:  <property name="A" ref="B"/>
-> A is the property name in the class
*/

import com.mycompany.hoang.buoi2.Knight;
import com.mycompany.hoang.buoi2.Weapon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("buoi2/buoi2_example1.xml");

        Weapon weapon = (Weapon) context.getBean("sword");
        System.out.println(weapon.getType());

        Knight knight = (Knight) context.getBean("knight_sword");
        System.out.println(knight);

        Knight knight_unique_sword = context.getBean("knight_unique_sword", Knight.class);
        System.out.println("Injecting an inner dependency object declared for only this object:");
        System.out.println(knight_unique_sword);
    }
}

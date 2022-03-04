package com.mycompany.hoang.buoi2.example2;

/*
+ Using only XML FILE to configure

+ Using CONSTRUCTOR INJECTION

+ XML file:
  <bean id="gun" class="com.mycompany.hoang.buoi2.example2.Gun"/>

  <bean id="knight_gun" class="com.mycompany.hoang.buoi2.Knight">
      <constructor-arg name="weapon" ref="gun"/>
      <constructor-arg name="name" value="Ari"/>
  </bean>

  <bean id="knight_unique_gun" class="com.mycompany.hoang.buoi2.Knight">
      <constructor-arg name="weapon">
          <bean class="com.mycompany.hoang.buoi2.example2.Gun"/>
      </constructor-arg>
      <constructor-arg name="name" value="Ari"/>
  </bean>

+ Explain:  <constructor-arg name="A" ref="B"/>
-> A is the parameter name in construtor
*/

import com.mycompany.hoang.buoi2.Knight;
import com.mycompany.hoang.buoi2.Weapon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("buoi2/buoi2_example2.xml");

        Weapon weapon = (Weapon) context.getBean("gun");
        System.out.println(weapon.getType());

        Knight knight = context.getBean("knight_gun", Knight.class);
        System.out.println(knight);

        Knight knight_unique_gun = context.getBean("knight_unique_gun", Knight.class);
        System.out.println("Injecting an inner dependency object declared for only this object:");
        System.out.println(knight_unique_gun);
    }
}

package com.mycompany.hoang.buoi1.example2;

/*
+ Using ANNOTATIONs to configure and adding a little line in XML file

+ Some annotations:
  _ @Component: define a bean, a simple JavaBean class
  _ @Service: define a service bean, which is a complex functional
    bean that provides services that other beans may require

+ XML file:
  <context:component-scan base-package="com.mycompany.hoang.buoi1.example2"/>
    _ context:component-scan: tell Spring to scan the code for injectable
      beans annotated
    _ base-package: the package and all its subpackages will be scaned
*/

import com.mycompany.hoang.buoi1.Oracle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("buoi1/buoi1_example2.xml");

        Oracle oracle = (Oracle) context.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}

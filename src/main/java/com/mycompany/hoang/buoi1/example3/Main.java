package com.mycompany.hoang.buoi1.example3;

/*
+ Using only a JAVA CLASS to configure

+ Some annotations:
  _ @Configuration: annotate the configuration class
  _ @Bean: annotate methods that are called directly by the Spring IOC container
    to instantiate the beans. The bean name will be the same as the name of the
    method used to create it
*/

import com.mycompany.hoang.buoi1.Oracle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(OracleConfiguration.class);

        Oracle oracle = (Oracle) context.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}

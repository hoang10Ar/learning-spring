package com.mycompany.hoang.buoi1.example1;

/*
+ Using only XML FILE to configure

+ XML file:
  <bean id="oracle" class="com.mycompany.hoang.buoi1.example1.BookwormOracle"/>
    _ id: id of this bean
    _ class: instance of this class will be created
*/

import com.mycompany.hoang.buoi1.Oracle;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new ClassPathResource("buoi1/buoi1_example1.xml"));

        Oracle oracle1 = factory.getBean("oracle", Oracle.class);
        System.out.println(oracle1.defineMeaningOfLife());


        ApplicationContext context = new
                ClassPathXmlApplicationContext("buoi1/buoi1_example1.xml");

        Oracle oracle2 = (Oracle) context.getBean("oracle");
        System.out.println(oracle2.defineMeaningOfLife());
    }
}

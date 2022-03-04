package com.mycompany.hoang.buoi3.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("buoi3/buoi3_example1.xml");

        String beanID = (String) context.getBean("beanID");
        System.out.println("Bean only has id: " + beanID);
        System.out.println();

        String beanName = (String) context.getBean("beanName");
        System.out.println("Bean only has name: " + beanName);
        System.out.println();

        String beanIDNotName = (String) context.getBean("beanIDNotName");
        String beanNameNotID = (String) context.getBean("beanNameNotID");
        System.out.println("Bean has both id and name: ");
        if(beanIDNotName == beanNameNotID) {
            System.out.println("Bean gotten by name and by id are the same");
        } else {
            System.out.println("Bean gotten by name and by id are the same");
        }
        System.out.println();

        String beanMultiID = (String) context.getBean("beanID1 beanID2");
        String beanName1 = (String) context.getBean("beanName1");
        String beanName2 = (String) context.getBean("beanName2");
        System.out.println("Bean has multiple names seperated by space, comma or semicolon: ");
        System.out.println("   Id: beanID1 beanID2");
        System.out.println("   Name: beanName1 beanName2");
        System.out.println("-> Bean has 1 id and 2 names");
        if(beanMultiID == beanName1 && beanName1 == beanName2) {
            System.out.println("3 beans are the same");
        } else {
            System.out.println("3 beans are not the same");
        }
        System.out.println();

        AnotherBean beanInAnnotation = (AnotherBean) context.getBean("AnotherBeanName");
        System.out.println("Bean can be named by using annotation such as @Component(name)");
        System.out.println(beanInAnnotation);
    }
}

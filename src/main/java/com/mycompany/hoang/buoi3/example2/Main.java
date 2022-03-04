package com.mycompany.hoang.buoi3.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("buoi3/buoi3_example2.xml");

        Singer singer1 = (Singer) context.getBean("singer");
        Singer singer2 = (Singer) context.getBean("singer");
        System.out.println("singer1 = getBean(\"singer\")");
        System.out.println("singer2 = getBean(\"singer\")");
        System.out.println("Is singer1 == singer2: " + (singer1 == singer2));
        System.out.println();

        System.out.println("singer1.getName() == " + singer1.getName());
        System.out.println("singer2.getName() == " + singer2.getName());
        singer1.setName("Teayeon");
        System.out.println("singer1.setName(\"Teayeon\")");
        System.out.println("singer2.getName() == " + singer2.getName());
        System.out.println();

        Singer singerPro1 = (Singer) context.getBean("singerPrototype");
        Singer singerPro2 = (Singer) context.getBean("singerPrototype");
        System.out.println("singerPro1 = getBean(\"singerPrototype\")");
        System.out.println("singerPro2 = getBean(\"singerPrototype\")");
        System.out.println("Is singerPro1 == singerPro2: " + (singerPro1 == singerPro2));
        System.out.println();

        System.out.println("singerPro1.getName() == " + singerPro1.getName());
        System.out.println("singerPro2.getName() == " + singerPro2.getName());
        singerPro1.setName("Teayeon");
        System.out.println("singerPro1.setName(\"Teayeon\")");
        System.out.println("singerPro2.getName() == " + singerPro2.getName());
        System.out.println();
    }
}

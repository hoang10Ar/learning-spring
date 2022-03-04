package com.mycompany.hoang.buoi3.example1;

import org.springframework.stereotype.Component;

@Component("AnotherBeanName")
public class AnotherBean {
    public String toString() {
        return "This bean is named by annotation";
    }
}

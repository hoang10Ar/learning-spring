package com.mycompany.hoang.buoi3.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Singer {
    private String name;

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(@Value("Ariana Grande") String name) {
        this.name = name;
    }
}

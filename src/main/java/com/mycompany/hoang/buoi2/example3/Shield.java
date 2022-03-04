package com.mycompany.hoang.buoi2.example3;

import com.mycompany.hoang.buoi2.Weapon;
import org.springframework.stereotype.Component;

@Component("shield")
public class Shield implements Weapon {
    @Override
    public String getType() {
        return "Buoi 2 - Example 3";
    }
}

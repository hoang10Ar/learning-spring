package com.mycompany.hoang.buoi2.example4;

import com.mycompany.hoang.buoi2.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("knight_shield")
public class ShieldKnight {
    private String name;
    private Weapon weapon;

    @Autowired
    public ShieldKnight(@Value("Gra") String name, Weapon shield) {
        this.name = name;
        this.weapon = shield;
    }

    public String toString() {
        return this.name + " is a knight with weapon "
                + weapon.getType();
    }
}

package com.mycompany.hoang.buoi2.example3;

import com.mycompany.hoang.buoi2.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("knight_shield")
public class ShieldKnight {
    private String name;
    private Weapon weapon;

    public ShieldKnight() {
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Autowired
    public void setWeapon(Weapon shield) {
        this.weapon = shield;
    }

    public String getName() {
        return name;
    }

    @Value("Grande")
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name + " is a knight with weapon "
                + weapon.getType();
    }
}

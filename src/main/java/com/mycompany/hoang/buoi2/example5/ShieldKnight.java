package com.mycompany.hoang.buoi2.example5;

import com.mycompany.hoang.buoi2.Weapon;

public class ShieldKnight {
    private String name;
    private Weapon weapon;

    public ShieldKnight(String name, Weapon shield) {
        this.name = name;
        this.weapon = shield;
    }

    public String toString() {
        return this.name + " is a knight with weapon "
                + weapon.getType();
    }
}

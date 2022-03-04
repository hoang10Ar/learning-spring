package com.mycompany.hoang.buoi2;

public class Knight {
    private String name;
    private Weapon weapon;

    public Knight() {
    }

    public Knight(Weapon weapon) {
        this.weapon = weapon;
    }

    public Knight(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name + " is a knight with weapon "
                + weapon.getType();
    }
}

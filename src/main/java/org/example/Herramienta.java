package org.example;

public class Herramienta {
    private String name;
    private Integer damage;

    public Herramienta() {

    }

    public Herramienta(String name, Integer damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Herramienta{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}

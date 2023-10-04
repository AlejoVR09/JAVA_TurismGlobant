package org.example.entities;

import org.example.Herramienta;

public class Samurai {

    private String name;
    private Herramienta katana;
    private Integer power;
    private Boolean status;
    private Alimento alimento;

    public Samurai() {

    }

    public Samurai(String name, Herramienta katana, Integer power, Boolean status, Alimento alimento) {
        this.name = name;
        this.katana = katana;
        this.power = power;
        this.status = status;
        this.alimento=alimento;
    }

    @Override
    public String toString() {
        return "Samurai{" +
                "name='" + name + '\'' +
                ", katana=" + katana +
                ", power=" + power +
                ", status=" + status +
                '}';
    }
}

package org.example.entities;

public class Alimento {
    private String nombre;
    private Integer calorias;

    public Alimento() {
    }

    public Alimento(String nombre, Integer calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", calorias=" + calorias +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }
}

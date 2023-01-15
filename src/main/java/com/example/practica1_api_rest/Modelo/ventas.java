package com.example.practica1_api_rest.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "tbventas")
public class ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    @Column
    private String electrodomestico;
    @Column
    private Double precio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getElectrodomestico() {
        return electrodomestico;
    }

    public void setElectrodomestico(String electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}

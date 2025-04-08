package org.example.lambdas.ejercicio;

import lombok.Getter;

@Getter
public class Empleado {
    private String nombre;
    private double salario;
    private String fecha;

    public Empleado(String nombre, double salario, String fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha = fecha;
    }
}

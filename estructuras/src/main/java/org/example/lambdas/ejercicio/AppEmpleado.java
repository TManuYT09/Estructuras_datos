package org.example.lambdas.ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppEmpleado {
    public static void main(String[] args) {
        List<Empleado> listaEmpleado = new ArrayList<>();

        listaEmpleado.add(new Empleado("Paco",1500.00,"12/12/2012"));
        listaEmpleado.add(new Empleado("Saco",1800.00,"13/12/2012"));
        listaEmpleado.add(new Empleado("Caco",1900.00,"14/12/2012"));
        listaEmpleado.add(new Empleado("Laco",1300.00,"15/12/2012"));
        listaEmpleado.add(new Empleado("Manco",500.00,"20/12/2012"));

        Collections.sort(listaEmpleado, Comparator.comparing(Empleado::getNombre));
        System.out.println("Ordenar por nombre alfabéticamente");
        for (Empleado emple : listaEmpleado){
            System.out.println("Nombre: "+emple.getNombre()+", Salario: "+emple.getSalario()+", Fecha: "+emple.getFecha());
        }

        Collections.sort(listaEmpleado,Comparator.comparing(Empleado::getSalario));
        System.out.println("Ordenar por salario de menor a mayor");
        for (Empleado emple : listaEmpleado){
            System.out.println("Nombre: "+emple.getNombre()+", Salario: "+emple.getSalario()+", Fecha: "+emple.getFecha());
        }

        Collections.sort(listaEmpleado,Comparator.comparing(Empleado::getFecha).reversed());
        System.out.println("Ordenar por fecha de contratación, con los más antiguos primero");
        for (Empleado emple : listaEmpleado){
            System.out.println("Nombre: "+emple.getNombre()+", Salario: "+emple.getSalario()+", Fecha: "+emple.getFecha());
        }

        Collections.sort(listaEmpleado,Comparator.comparing(Empleado::getSalario).thenComparing(Empleado::getNombre));
        System.out.println("Ordenar por salario (de mayor a menor) y luego por nombre alfabéticamente");
        for (Empleado emple : listaEmpleado){
            System.out.println("Nombre: "+emple.getNombre()+", Salario: "+emple.getSalario()+", Fecha: "+emple.getFecha());
        }
    }
}

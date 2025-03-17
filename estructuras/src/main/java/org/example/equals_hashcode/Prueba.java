package org.example.equals_hashcode;

import java.util.LinkedHashSet;

public class Prueba {
    public static void main(String[] args) {
        Paciente raul = new Paciente("123456", "Raúl", "García Delgado");
        Paciente xavi = new Paciente("456321", "Javier", "Cervera Lillo");
        Paciente javi = new Paciente("235687", "Javier", "Cervera Lillo");

        LinkedHashSet<Paciente> listaPacientes = new LinkedHashSet<>();
        listaPacientes.add(raul);
        listaPacientes.add(xavi);
        listaPacientes.add(javi);

        System.out.println(xavi.hashCode());
        System.out.println(javi.hashCode());
        xavi.equals(javi);

        System.out.println(listaPacientes);
    }
}

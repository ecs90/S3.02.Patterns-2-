package org.ecs90;

import java.util.Objects;

public class Agencia implements Observer {
    private String nombre;

    public Agencia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return Objects.equals(nombre, agencia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(double valor) {
        System.out.println("Agencia " + nombre + " recibió la notificación: el valor actual de la Bolsa es " + valor);
    }
}

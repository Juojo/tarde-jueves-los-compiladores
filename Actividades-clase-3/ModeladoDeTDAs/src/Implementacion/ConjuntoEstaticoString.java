package Implementacion;

import Interface.ConjuntoStringTDA;

public class ConjuntoEstaticoString implements ConjuntoStringTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad;

    @Override
    public void InicializarConjunto() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(String nombre) {
        if (cantidad < MAX && !Pertenece(nombre)) {
            datos[cantidad] = nombre;
            cantidad++;
        }
    }

    @Override
    public void Sacar(String nombre) {
        int i = 0;
        while (i < cantidad && !(datos[i].equals(nombre))) {
            i++;
        }

        if (i < cantidad) {
            datos[i] = datos[cantidad - 1];
            cantidad--;
        }
    }

    @Override
    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    @Override
    public boolean Pertenece(String nombre) {
        int i = 0;
        while (i < cantidad) {
            if (datos[i].equals(nombre)) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public String Elegir() {
        return datos[0];
    }
}

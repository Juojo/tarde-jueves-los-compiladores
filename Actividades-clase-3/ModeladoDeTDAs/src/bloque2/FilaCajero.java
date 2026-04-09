import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class Persona {

    String nombre;
    int prioridad;

    public Persona(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

}

public interface ColaTDA {
    void inicializarCola();
    void acolar();
    void desacolar();



}

public class Cola implements ColaTDA {

    ArrayList<Persona> cola;

    public Cola() {

    }

    @java.lang.Override
    public void inicializarCola() {
        cola = new ArrayList<Persona>();
    }

    @java.lang.Override
    public void acolar(Persona persona) {
        cola.add(persona);
    }
}

public class FilaCajero {

//PilaTDA filaCajero = new FilaCajero;
    Cola colaCajero = new Cola();

    public FilaCajero() {
        colaCajero.InicializarCola();
        colaCajero.agregarPersona(new Persona("Juan", 1))
        colaCajero.agregarPersona(new Persona("Juan", 2))
        colaCajero.agregarPersona(new Persona("Juan", 2))

    }

    public void agregarPersona(Persona persona) {

    }


    public OrdenarPrioridad() {


    }
}
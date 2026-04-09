package bloque2;
import Implementacion.ColaPrioridadEstatica;
import Interfaces.ColaPrioridadTDA;

public class FilaCajero {
    
    ColaPrioridadTDA filaCajero = new ColaPrioridadEstatica() {
        
    };

    public FilaCajero() {
        filaCajero.InicializarColaPrioridad();
        filaCajero.AcolarPrioridad(17, 35);
        filaCajero.AcolarPrioridad(1, 45);
        filaCajero.AcolarPrioridad(5, 50);

    }
}
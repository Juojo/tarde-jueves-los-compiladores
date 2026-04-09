
import Interface.ColaPrioridadTDA;
import Implementacion.ColaPrioridadEstatica;


public class ProcesadorTareas {
    public void main(String[] args){
        ColaPrioridadTDA colaConPrioridad= new ColaPrioridadEstatica();
        colaConPrioridad.InicializarColaPrioridad();
        
        colaConPrioridad.AcolarPrioridad(1, 50);
        colaConPrioridad.AcolarPrioridad(2, 10);
        colaConPrioridad.AcolarPrioridad(3, 20);

        // Si el sistema se sobrecarga pasa al siguiente proceso 
        // porque el proceso que se trata de AcolarPrioridad() no 
        // entra, y no va a entra ninguno hasta que se haga Desacolar()
        // o libere espacio.

    }
}

package bloque2;
import Interface.ColaPrioridadTDA;
import Implementacion.ColaPrioridadEstatica;

public class ExamenFinal {
    public void main(String[] args){
        ColaPrioridadTDA colaPrioridad=new ColaPrioridadEstatica();
        colaPrioridad.InicializarColaPrioridad();

        colaPrioridad.AcolarPrioridad(1, 5);
        colaPrioridad.AcolarPrioridad(2, 10);

        System.out.println(colaPrioridad.Primero()); // Va a mostrar que el alumno que promociono por mas que llego despues pasa primero por la prioridad.
        colaPrioridad.Prioridad();
        colaPrioridad.Desacolar();
        


    }
}

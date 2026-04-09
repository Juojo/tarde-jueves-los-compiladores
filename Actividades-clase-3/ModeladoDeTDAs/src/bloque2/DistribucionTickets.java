package bloque2;
import Interfaces.ColaPrioridadTDA;
import Implementacion.ColaPrioridadEstatica;

public class DistribucionTickets {
    public void main(String[] args){
        ColaPrioridadTDA colaConPriori= new ColaPrioridadEstatica();

        colaConPriori.InicializarColaPrioridad();
        colaConPriori.AcolarPrioridad(1, 999);
        colaConPriori.AcolarPrioridad(2, 0);
        System.out.println(colaConPriori.Primero());
    }
}

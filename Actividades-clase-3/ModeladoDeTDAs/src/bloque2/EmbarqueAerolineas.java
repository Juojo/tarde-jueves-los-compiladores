import Interface.ColaPrioridadTDA;
import Implementacion.ColaPrioridadEstatica;

public class EmbarqueAerolineas {
    public void main(String[] args){
        ColaPrioridadTDA colaPriori= new ColaPrioridadEstatica();
        colaPriori.InicializarColaPrioridad();
        colaPriori.AcolarPrioridad(1, 3);
        colaPriori.AcolarPrioridad(2, 3);
        colaPriori.AcolarPrioridad(3, 2);
        colaPriori.AcolarPrioridad(4, 1);

        System.out.println(colaPriori.Primero());
    }
}
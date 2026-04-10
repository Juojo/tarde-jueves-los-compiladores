package bloque3;
import Interfaces.ConjuntoTDA;
import Implementacion.ConjuntoEstatico;

public class GestionLegajos {
    public void main(String[] args){
        ConjuntoTDA conjunto= new ConjuntoEstatico();
        conjunto.InicializarConjunto();
        conjunto.Agregar(12345);
        conjunto.Agregar(12345); // El conjunto no permite que se ingrese el legajo devuelta porque ya existe.
    }
}

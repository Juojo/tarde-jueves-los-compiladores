import Interface.ConjuntoStringTDA;
import Implementacion.ConjuntoStringEstatico;

public class TagsBlog {
    public void main(String[] args){
        ConjuntoTDA conjunto= new ConjuntoEstatico();
        conjunto.Agregar("mate");
        conjunto.Agregar("mate 2");
        conjunto.Agregar("mate 3");
        conjunto.Agregar("mate 4"); // En los conjuntos no se puede repetir lo que ingresas entonces es 
        // mejor usarlos para este caso porque los canales no deben ni pueden estar repetidos.
    }
    
}

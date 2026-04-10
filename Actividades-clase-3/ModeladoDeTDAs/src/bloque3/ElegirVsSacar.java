import Interface.ConjuntoTDA;
import Implementacion.ConjuntoEstatico;

public class ElegirVsSacar {
    public void main(String[] args){
        ConjuntoTDA conjunto= new ConjuntoEstatico();
        conjunto.InicializarConjunto();
        conjunto.Elegir();
        conjunto.Elegir(); // El conjunto en la funcion elegir es arbitrario osea que uno decide que te va a devolver
        //  ya sea el primer elemento o el ultimo entonces si, si se ponen dos veces la funcion elegir sin sacar nada va a ser el mismo elemento.
    }
}

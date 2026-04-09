package bloque2;

import Implementacion.ColaEstatica;
import Interfaces.ColaTDA;

public class ImpresoraLaboratorio {

    ColaTDA impresoraLaboratorio = new ColaEstatica(){
};

    public ImpresoraLaboratorio() {
        impresoraLaboratorio.InicializarCola();
        impresoraLaboratorio.Acolar(1);
        impresoraLaboratorio.Acolar(2);
        impresoraLaboratorio.Acolar(3);
        impresoraLaboratorio.Acolar(4);
    }

}
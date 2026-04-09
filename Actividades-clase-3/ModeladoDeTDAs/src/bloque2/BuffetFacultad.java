package bloque2;
import Interfaces.ColaTDA;
import Implementacion.ColaEstatica;

public class BuffetFacultad {
    public void main(String[] args){
        ColaTDA cola= new ColaEstatica();
        cola.InicializarCola();
        cola.Acolar(1); // Usas una cola normal para que nadie tenga prioridad sobre nadie sino que son atendidos en base a cuando llegaron.
        cola.Acolar(2);
        cola.Acolar(3);
        cola.Acolar(4);
        cola.Acolar(5);
        System.out.println(cola.Primero());
    }
}

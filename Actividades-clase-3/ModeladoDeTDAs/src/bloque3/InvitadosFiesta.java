package bloque3;
import Interfaces.ConjuntoStringTDA;
import Implementacion.ConjuntoStringEstatico;

public class InvitadosFiesta {
    public void main(String[] args){
        ConjuntoStringTDA conjunto= new ConjuntoStringEstatico();
        conjunto.Agregar("Nacho Monzon");
        conjunto.Agregar("Eugenio Errante");
        conjunto.Agregar("Juan Inguanzo");
        conjunto.Agregar("Juan de la Cruz Campos");
        conjunto.Agregar("Nacho Monzon");
        // En los conjuntos no se puede repetir lo que ingresas entonces no va a permitir que 
        // ingreses el mismo invitado dos veces, no cambia el tamaño del conjunto.
    }
    
}

package bloque3;
import Interfaces.ConjuntoStringTDA;

import java.util.Scanner;

import Implementacion.ConjuntoStringEstaticoString;

public class PalabraProhibida {
    public void main(String[] args){
        ConjuntoStringTDA conjunto= new ConjuntoStringEstaticoString();
        conjunto.Agregar("Crypto");
        conjunto.Agregar("Gana");
        conjunto.Agregar("Premio");

        Scanner mail= new Scanner(System.in);
        String completo=mail.nextLine();

        String[] palabrasMail;
        palabrasMail= completo.split(" ");
        
        for(int i=0;i<palabrasMail.length;i++){
            if (conjunto.Pertenece(palabrasMail[i])){
                System.out.println("palabra prohibida encontrada");
            }
        }
        

        mail.close();
        // En los conjuntos no se puede repetir lo que ingresas entonces no va a permitir que 
        // ingreses el mismo invitado dos veces, no cambia el tamaño del conjunto.
    }
    
}

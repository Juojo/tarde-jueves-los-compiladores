import Interfaces.DiccionarioMultipleStringAmbosTDA;
import Implementacion.DiccionarioMultipleEstaticoStringAmbos;

public class TraductorIdiomas {
    public static void main(String[] args){ //usarioa multiple porque una palabra puede tener 
    // varios significados y es lo que se quiere reflejar.
    
        DiccionarioMultipleStringAmbosTDA traducciones= new DiccionarioMultipleEstaticoStringAmbos();
        traducciones.Agregar("right", "derecho");
        traducciones.Agregar("right", "derecha");
        traducciones.Agregar("right", "correcto");

    System.out.println(traducciones.Recuperar("right"));
    }

    
}

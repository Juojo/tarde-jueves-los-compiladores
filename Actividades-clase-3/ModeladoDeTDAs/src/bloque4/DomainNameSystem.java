import Implementacion.DiccionarioMultipleEstaticoStringAmbos;
import Interface.DiccionarioMultipleStringAmbosTDA;

public class DomainNameSystem {
    public static void main(String[] args) {
        DiccionarioMultipleStringAmbosTDA sinonimos = new DiccionarioMultipleEstaticoStringAmbos();
        sinonimos.Agregar("google.com", "142.250.190.46");
        sinonimos.Agregar("google.com", "142.250.190.47"); // Se implementa diccionarios multiples porque un dominio puede 
        // tener diferentes ip, depende de la cantidad de usuarios que tenga ese dominio.
        sinonimos.Agregar("google.com", "142.250.190.48");

        System.out.println(sinonimos.Recuperar("google.com"));





    }
}

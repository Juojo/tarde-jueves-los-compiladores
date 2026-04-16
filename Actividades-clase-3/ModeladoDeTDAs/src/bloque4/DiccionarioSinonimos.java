
import Implementacion.DiccionarioMultipleEstaticoStringAmbos;
import Interfaces.DiccionarioMultipleStringAmbosTDA;

public class DiccionarioSinonimos {
    public static void main(String[] args) {
        DiccionarioMultipleStringAmbosTDA sinonimos = new DiccionarioMultipleEstaticoStringAmbos();
        sinonimos.Agregar("anda", "funciona");
        sinonimos.Agregar("anda", "corre");

        System.out.println(sinonimos.Recuperar("anda"));





    }
}

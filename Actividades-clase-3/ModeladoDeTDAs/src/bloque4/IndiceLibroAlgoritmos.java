
import Implementacion.DiccionarioMultipleEstaticoStringAmbos;
import Interfaces.DiccionarioMultipleStringPrimeroTDA;

public class IndiceLibroAlgoritmos {
    public static void main(String[] args) {
        DiccionarioMultipleStringPrimeroTDA sinonimos = new DiccionarioMultipleEstaticoStringAmbos();
        sinonimos.Agregar("anda", "funciona");
        sinonimos.Agregar("anda", "corre");

        System.out.println(sinonimos.Recuperar("anda"));





    }
}


import Implementacion.DiccionarioMultipleEstaticoStringAmbos;
import Interface.DiccionarioMultipleStringPrimeroTDA;

public class IndiceLibroAlgoritmos {
    public static void main(String[] args) {
        DiccionarioMultipleStringPrimeroTDA sinonimos = new DiccionarioMultipleEstaticoStringAmbos();
        sinonimos.Agregar("anda", "funciona");
        sinonimos.Agregar("anda", "corre");

        System.out.println(sinonimos.Recuperar("anda"));





    }
}
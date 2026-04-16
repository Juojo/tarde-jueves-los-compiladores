import Implementacion.DiccionarioSimpleEstaticoString;
import Interfaces.DiccionarioSimpleStringTDA;

public class PuntajeTorneoESports {
    public static void main(String[] args){
        DiccionarioSimpleStringTDA puntos=new DiccionarioSimpleEstaticoString();
        puntos.Agregar("diego forlan", 1500);
        puntos.Agregar("luis suarez", 1965);
        System.out.println(puntos.Claves());





    }
}

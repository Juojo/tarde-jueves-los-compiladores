
import Interfaces.DiccionarioMultipleStringUnoTDA;
import Implementacion.DiccionarioMultipleEstaticoStringUno;

public class InscripcionAlumno {
    public static void main(String[] args){
        DiccionarioMultipleStringUnoTDA inscripcion = new DiccionarioMultipleEstaticoStringUno();

        inscripcion.Agregar(1213517, "si2");
        inscripcion.Agregar(1213517, "progra2");
        System.out.println(inscripcion.Recuperar(1213517));




    }

}

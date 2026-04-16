import Implementacion.DiccionarioSimpleEstaticoString;
import Interfaces.DiccionarioSimpleStringTDA;

public class AgendaContactos {
    public static void main(String[] args){
        DiccionarioSimpleStringTDA numero=new DiccionarioSimpleEstaticoString();
        numero.Agregar("roberto alexei", 1139896745);
        numero.Agregar("roberto gimnasio", 1139896965);
        System.out.println(numero.Claves());





    }
}

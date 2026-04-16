
import Interface.DiccionarioMultipleStringUnoTDA;
import Implementacion.DiccionarioMultipleEstaticoStringUno;

public class ChipotleSupportBot {
    public static void main(String[] args){
        DiccionarioMultipleStringUnoTDA bot = new DiccionarioMultipleEstaticoStringUno();

        bot.Agregar(1517, "scrypt python1: ....");
        bot.Agregar(1518, "scrypt python2: ....");
        System.out.println(bot.Recuperar(1517));
        System.out.println(bot.Recuperar(1518));



    }

}

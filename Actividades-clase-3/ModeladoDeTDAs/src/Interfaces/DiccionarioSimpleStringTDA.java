package Interface;

public interface DiccionarioSimpleStringTDA {
    void InicializarDiccionario();
    void Agregar(String clave, int valor);
    void Eliminar(String clave);
    String[] Claves();
}
package Interfaces;

public interface DiccionarioMultipleStringPrimeroTDA {
    void InicializarDiccionario();
    void Agregar(String clave, int valor);
    void EliminarValor(String clave, int valor);
    void Eliminar(String clave);
    String[] Recuperar(String clave);
    int[] Claves();
}

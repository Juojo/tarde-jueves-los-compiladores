package Interface;

public interface ConjuntoStringTDA {
    void InicializarConjunto();
    void Agregar(String nombre);
    void Sacar(String nombre);
    boolean ConjuntoVacio();
    boolean Pertenece(String nombre);
    String Elegir();
}

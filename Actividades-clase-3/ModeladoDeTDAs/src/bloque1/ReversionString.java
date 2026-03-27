
public interface ReversionString {
    void InicializarPila();
    void Apilar(char letra);
    void Desapilar();
    String Tope();
    boolean PilaVacia();

}

public class Directorio implements ReversionString {
    private static final int MAX=100;
    private char[] primerapalabra;
    private int cantidad;
    private String palabra;
    
    @Override
    public void InicializarPila() {
        primerapalabra = new char[MAX];
        cantidad=0;
    }

    @Override
    public void Apilar(char letra){
        if (cantidad < MAX){
            primerapalabra[cantidad]=letra;
            cantidad++;
        }
    }

    @Override
    public void Desapilar(){    //Cuando desapilas guarda en la variable palabra la palabra que se va formando, cuando termina queda SOMTIROGLA o ALGORITMOS escrito al reves
        if (!PilaVacia()){
            palabra=palabra+primerapalabra[cantidad-1];
            cantidad--;
            
        }
    }

    @Override
    public char Tope(){   
        return primerapalabra[cantidad-1];
    }

    @Override
    public boolean PilaVacia(){
        return cantidad==0;
    }

}

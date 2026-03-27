
public interface PilaLLamadas {
    void InicializarPila();
    void Apilar(char valor);
    void Desapilar(char valorDesapilado);
    String Tope();
    boolean PilaVacia();

}

public class Directorio implements PilaLLamadas{
    private static final int MAX=100;
    private char[] pila;
    private int cantidad;
    
    @Override
    public void InicializarPila() {
        pila=new String[MAX];
        cantidad=0;
    }

    @Override
    public void Apilar(char valor){
        if (valor=='(')
            if (cantidad < MAX){
                pila[cantidad]=valor;
                cantidad++;
            }
    }

    @Override
    public void Desapilar(char valorDesapilado){
        if (valorDesapilado==')')
            if (!PilaVacia()){
                cantidad--;
                
            }
    }

    @Override
    public String Tope(){   
        return pila[cantidad-1];
    }

    @Override
    public boolean PilaVacia(){
        return cantidad==0;
    }

}
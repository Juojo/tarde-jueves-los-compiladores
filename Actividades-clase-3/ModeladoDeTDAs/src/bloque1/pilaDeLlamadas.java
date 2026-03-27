
public interface PilaLLamadas {
    void InicializarPila();
    void Apilar(String nombreMetodo);
    void Desapilar();
    String Tope();
    boolean PilaVacia();

}

public class Directorio implements PilaLLamadas{
    private static final int MAX=100;
    private String[] metodo;
    private int cantidad;
    
    @Override
    public void InicializarPila() {
        metodo=new String[MAX];
        cantidad=0;
    }

    @Override
    public void Apilar(String nombreMetodo){
        if (cantidad < MAX){
            metodo[cantidad]=nombreMetodo;
            cantidad++;
        }
    }

    @Override
    public void Desapilar(){
        if (!PilaVacia()){
            cantidad--;
            
        }
    }

    @Override
    public String Tope(){   //En el tope en el momento de la ejecucion de la suma se encuentra la suma. es el ultimo que entro 
        return metodo[cantidad-1];
    }

    @Override
    public boolean PilaVacia(){
        return cantidad==0;
    }

}

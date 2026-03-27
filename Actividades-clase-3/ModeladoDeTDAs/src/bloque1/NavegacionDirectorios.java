
public interface NavegacionDirectorios {
    void InicializarPila();
    void Apilar(string nivel);
    void Desapilar();
    String Tope();
    boolean PilaVacia();

}

public class Directorio implements NavegacionDirectorios{
    private static final int MAX=100
    private String[] cualDirectorio;
    private int cantidad;
    
    @Override
    public void InicializarPila() {
        cualDirectorio=new String[MAX];
        cantidad=0;
    }

    @Override
    public void Apilar(String nivel){
        if (cantidad<MAX){
            cualDirectorio[cantidad]=nivel;
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
    public String Tope(){   //Este devuelve el directorio en el que te encontras
        return cualDirectorio[cantidad-1];
    }

    @Override
    public boolean PilaVacia(){
        return cantidad==0;
    }

}

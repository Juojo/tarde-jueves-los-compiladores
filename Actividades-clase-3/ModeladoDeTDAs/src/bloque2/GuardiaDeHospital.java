package bloque2;

public class GuardiaDeHospital implements GuardiaHospital {
    private static final int TOTAL=100;
    private int cantidad;
    private int[] filaHosp;
    private int[] prioridadHosp;

    @Override
    public void InicializarCola(){
        filaHosp= new int[TOTAL];
        prioridadHosp= new int[TOTAL];
        cantidad=0;
    }

    @Override
    public void Acolar(int numPaciente, int prioridad){ // Embarazada prioridad 99, discapacitado prioridad 98, joven con quemaduras prioridad 25.
        if (cantidad<TOTAL){
            filaHosp[cantidad]=numPaciente;
            prioridadHosp[cantidad]=prioridad;
            cantidad++;
        }
    }

    @Override
    public void Desacolar(){
        if (!ColaVacia()){
            int pos=0;
            for (int i=1;pos<cantidad;i++){
                if (prioridadHosp[i]>prioridadHosp[pos]){
                    pos=i;
                }
            }
            for (int i=pos;pos<cantidad-1;i++){
                filaHosp[i]=filaHosp[i+1];
                prioridadHosp[i]=prioridadHosp[i+1];
            }
            cantidad--;
        }
    }

    @Override
    public int Tope(){
        return filaHosp[0];
    }

    @Override
    public boolean ColaVacia(){
        return cantidad==0;
    }
}

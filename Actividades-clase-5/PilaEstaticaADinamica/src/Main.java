import java.util.Random;

import Implementacion.PilaDinamica;
import Implementacion.PilaEstatica_Estrategia_1;
import Interfaces.PilaTDA;

public class Main {
	
	public static Random r = new Random();

	public static void main(String[] args) {
		// Pila estatica (original)
		PilaEstatica_Estrategia_1 pilaEstatica = new PilaEstatica_Estrategia_1();
	
		pilaEstatica.InicializarPila();
		llenarPilaRandom(pilaEstatica);
		
		System.out.println("Tope pila estatica: " + pilaEstatica.Tope());
		
		// Pila auxiliar, tambien estatica
		PilaEstatica_Estrategia_1 pilaAuxiliarEstatica = new PilaEstatica_Estrategia_1();
		
		pilaAuxiliarEstatica.InicializarPila();
		apilarPilaAux(pilaEstatica, pilaAuxiliarEstatica);
		
		// Pila dinamica
		PilaTDA pilaDinamica = new PilaDinamica();
		pilaDinamica.InicializarPila();
		
		while (!pilaAuxiliarEstatica.PilaVacia()) {
			pilaDinamica.Apilar(pilaAuxiliarEstatica.Tope());
			pilaAuxiliarEstatica.Desapilar();
		}
		
		System.out.println("Tope pila dinamica (copia): " + pilaDinamica.Tope());
	}
	
	public static void llenarPilaRandom(PilaEstatica_Estrategia_1 pila) {
		for (int i = 0; i < pila.getMax()-1; i++) {
			pila.Apilar(r.nextInt(1000, 9999));
		}
	}
	
	public static void apilarPilaAux(PilaEstatica_Estrategia_1 pilaOriginal, PilaEstatica_Estrategia_1 pilaAux) {
		for (int i = 0; i < pilaOriginal.getCantidad()-1; i++) {
			pilaAux.Apilar(pilaOriginal.Tope());
			pilaOriginal.Desapilar();
		}
	}

}

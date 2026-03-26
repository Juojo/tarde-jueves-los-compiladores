package bloque1;

import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class HistorialNavegacion {
	
	PilaTDA pilaHistorial = new Estrategia_1();

	public HistorialNavegacion() {
		pilaHistorial.InicializarPila();
	}
	
	public void cargarPagina(String url) {
		pilaHistorial.Apilar(url);
	}
	
	public void volverAtras() {
		if (!pilaHistorial.PilaVacia())
			pilaHistorial.Desapilar();
	}

}

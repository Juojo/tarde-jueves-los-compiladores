package bloque1;

import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class editorCodigo {
	String codigoActual;
	PilaTDA pilaHistorial = new Estrategia_1();

	public editorCodigo() {
		pilaHistorial.InicializarPila();
	}
	
	public void cargarPagina(String nuevoCodigo) {
		pilaHistorial.Apilar(codigoActual);
        codigoActual=nuevoCodigo;
	}
	
	public void regresarLineaCodigo() {
		if (!pilaHistorial.PilaVacia()) {
            codigoActual=pilaHistorial.Tope();
			pilaHistorial.Desapilar();
        }
	}

}
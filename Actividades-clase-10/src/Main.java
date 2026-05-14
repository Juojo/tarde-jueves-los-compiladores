//1) 
//EJERCICIO 1: Análisis de ciclos anidados con condición
//Determiná la familia de complejidad temporal del siguiente método en el peor caso. Justificá analizando el comportamiento de los índices.
public static int buscarYValidar(int[] array) {
    for(int i = 0; i < array.length; i++) {     //O(N)  / O(N)*(O(1)+O(1)), se desprecia ambos O(1)
        if(array[i] == 5) {                   //O(1)
            return i;                         //O(1)
        } else {
            for(int j = 0; j < i; j++) {      //O(N)  / O(N)*(O(1)), se desprecia O(1)
                if(array[j] == 6) return i;   //O(1)
            }
        }
    }
    return -1;                               //O(1)
}                                            // O(N)*O(N)+O(1), se desprecia O(1)
                                             //RESULTADO= O(N^2)

//2)
//Analizá la operación Acolar(x) en:
//1.ColaPU (Estática): El nuevo elemento va siempre a la posición 0.             O(N), porque al Acolar(x) mueve todos los elementos para meter el elemento en la posicion 0.
//2.ColaPI (Estática): El nuevo elemento va al final del arreglo.                O(1), porque al Acolar(x) se ingresa en la ultima posicion no necesita nigun bucle.
//3.ColaLD (Dinámica): Usa nodos con punteros al primero y último.               O(1), porque al Acolar(x) se ingresa en la ultima posicion no necesita nigun bucle.
// Indica el costo temporal para cada una y justifica por qué la                 ColaPU es diferente porque mueve todos los elementos de la cola con un bucle para que quede en la posicion 0 mientras que los otros solo acolan sin utilizar este bucle.
// implementación estática "PU" es distinta a las demás.

//3)
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}

//4)


//5)


//6)
//EJERCICIO 6: Jerarquía de Dominancia
//Determiná la familia de complejidad total del siguiente bloque de código aplicando las reglas de simplificación.
public static void procesoMezclado(int[] datos) {
    int n = datos.length;                                                 //O(1)
    // Bloque A: Bucle simple
    for (int i = 0; i < n; i++) { System.out.println(datos[i]); }         //O(N)
    // Bloque B: Bucles anidados
    for (int i = 0; i < n; i++) {                                         //O(N)
        for (int j = 0; j < n; j++) { datos[i] += datos[j]; }             //O(N)
    }                                                                     //O(1)+O(N)+O(N)*O(N), se desprecia O(1) y O(N). Queda O(N)*O(N)=O(N^2)
}

//7)


//8)
//EJERCICIO 8: El costo oculto del TDA Conjunto
//Se desea calcular la intersección de dos Conjuntos (A y B) 
// de tamaño n cada uno usando implementaciones estáticas. El algoritmo 
// recorre A y por cada elemento llama a B.Pertenece(x). Si es true, lo agrega a un 
// conjunto resultado usando Agregar(x). ¿Cuál es la complejidad temporal real considerando las validaciones internas del TDA?.
//RESPUESTA: La complejidad temporal es Exponencial porque tenes que recorre A y dentro de a se fija si Pertenece(x) a B, la implementacion de Pertenece(x) se fija con un while el conjunto para ver si pertenece y en el peor de los casos es O(N) multiplicandolo por el bucle externo que recorre todo A tambien es O(N). O(N)*O(N)=O(N^2)


//9)
//EJERCICIO 9: Parámetros múltiples (Cola con Prioridad)
//Analizá la operación Desacolar() en una Cola con Prioridad implementada con K subcolas. Justificá por qué su complejidad es O(K) y por qué se dice que es independiente de la cantidad total de elementos n.
//la operacion Desacolar() en una cola con prioridad va a recorrer las K subcolas en busca del elemento entonces es O(K), no busca los elementos sino el estado de las subcolas.


//10)
//EJERCICIO 10: Análisis de algoritmo con recursión doble
//Dada la implementación recursiva de Fibonacci:
public static int fibonacci(int n) {
    if (n <= 1) return n;                               //O(1)
    return fibonacci(n - 1) + fibonacci(n - 2);         //O(N)+O(N) pero cada O(N) hace otra llamada a O(N)
}                                                       //El costo final es O(N) EXPONENCIAL porque no sabemos que numero va a ingresarse en la primer llamada entonces va a llamarse recursivamente hasta que se rompa el ciclo cundo sea menor o igual a 1. No es lineal porque se suman los dentor de el bucle llama a otro bucle.
//Sin realizar el cálculo matemático exacto, indicá a qué familia de costo 
// (jerarquía) pertenece (¿Constante, Lineal o Exponencial?) y justificá basándote en el crecimiento de las llamadas.
//}

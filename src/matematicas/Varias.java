package matematicas;
/**
 * Biblioteca de funciones matemáticas de propósito general.
 * Contiene algoritmos para manipulación de números enteros.
 */

/**
 * Comprueba si un número entero positivo es capicúa.
 * <p>
 * Un número es capicúa si se lee igual de izquierda a derecha
 * que de derecha a izquierda (ej: 121, 5005).
 * La implementación utiliza aritmética pura para invertir el número
 * sin necesidad de convertirlo a Texto (String), optimizando así la memoria.
 * </p>
 *
 * @param n El número entero positivo a verificar.
 * @return <code>true</code> si el número es capicúa, <code>false</code> en caso contrario.
 */

public class Varias {
    public static boolean Escapicua(int n){
          int residuo;
          int resultado=0;
          int aux = n;

          while(n>0) {
          residuo =  n % 10;
          resultado = (resultado * 10) + residuo;

           n = n/10;
        }

         if (aux == resultado) {
            return true;
         }else  {
            return false;
         }
    }

    public static boolean esPrimo(int x) {
        for (int i=2; i<x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int x) {

        int siguiente=x+1;
        while(!esPrimo(siguiente)) {
            siguiente++;
        }

     return siguiente;
    }

}


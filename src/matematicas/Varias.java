package matematicas;
/**
 * Biblioteca de funciones matemáticas de propósito general.
 * Contiene algoritmos para manipulación de números enteros.
 */



public class Varias {

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
    public static boolean Escapicua(int n) {
        int residuo;
        int resultado = 0;
        int aux = n;

        while (n > 0) {
            residuo = n % 10;
            resultado = (resultado * 10) + residuo;

            n = n / 10;
        }

        if (aux == resultado) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int x) {

        int siguiente = x + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }

        return siguiente;
    }

    /**
     * Calcula la potencia de un número de forma manual utilizando un ciclo iterativo.
     * <p>
     * Incluye optimizaciones para casos base:
     * <ul>
     * <li>Si el exponente es 0, retorna 1.</li>
     * <li>Si el exponente es 1, retorna la misma base.</li>
     * </ul>
     * </p>
     *
     * @param base      El número base que se va a multiplicar.
     * @param exponente La cantidad de veces que se multiplica la base (debe ser positivo).
     * @return El resultado de la operación matemática.
     */
    public static double potencia(double base, int exponente) {
        double resultado = 1;

        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return base;
        } else {
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
        }
        return resultado;
    }

    public static int contarDigitos(int n) {
        int contador = 0;

        if (n == 0) {
            return contador =1;
        }

     if (n < 0 ){
         n = n * -1;
     }
        while (n > 0) {
            int residuo = n % 10;
            n = n / 10;
            contador++;
        }
        return contador;
    }
}


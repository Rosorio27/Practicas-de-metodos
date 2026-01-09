import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        System.out.print("Introduzca un numero positivo: ");
        int n = lr.nextInt();

        boolean esPrimo = true;
        for (int i=2; i<n; i++) {
            if ((n % i) == 0) {
                esPrimo = false;
            }
        }

        if (esPrimo) {
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }
    }
}

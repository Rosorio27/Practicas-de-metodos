import matematicas.Varias;

import java.util.Scanner;

public class PruebasUnitaria {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero para comprobar el siguiente numero primo");
        int num = sc.nextInt();

        System.out.print("El siguiente numero primo es de  "+num+ "es: "+Varias.siguientePrimo(num));

    }
}

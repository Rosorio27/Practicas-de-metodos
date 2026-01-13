import java.util.Scanner;
import  matematicas.Varias;

public class PruebaCapio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();

      if (Varias.esPrimo(num)){
          System.out.print("Es un numermo capicua");
        }else {
          System.out.print("No es un numermo capicua");
        }
    }
}














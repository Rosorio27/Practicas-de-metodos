import java.util.Scanner;
import static matematicas.Varias.esPrimo;

public class EsPruebaPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int x = sc.nextInt();

        if (esPrimo(x)){
            System.out.println("Primo");
        }else {
            System.out.println("No Primo");
        }
    }
}

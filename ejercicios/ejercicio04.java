package ejercicios;
import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println("EL numero "+numero +" es par");

        }else{
            System.out.println("EL numero "+numero +" es impar");
        }
        
    }
}

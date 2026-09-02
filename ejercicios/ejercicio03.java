package ejercicios;
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese su nombre");
    String nombre = scanner.nextLine();
    System.out.println("Ingrese su edad");
    String edad = scanner.nextLine();
    System.out.println("Hola "+ nombre);
    System.out.println("Tienes "+ edad+ "años");
    }
    
}

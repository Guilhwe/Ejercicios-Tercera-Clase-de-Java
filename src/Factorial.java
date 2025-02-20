import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = lectura.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);
        lectura.close();    
    }
}

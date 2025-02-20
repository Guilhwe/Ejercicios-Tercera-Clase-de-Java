import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Se te pedirá que introduzcas dos números enteros.");
        System.out.println("Introduce el primer número entero: ");
        int num1 = lectura.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        int num2 = lectura.nextInt();
        if (num1 == num2){
            System.out.println("Los números son iguales");
        } else if (num1 > num2){
            System.out.println("El primer número es mayor que el segundo");
        } else {
            System.out.println("El segundo número es mayor que el primero");
        }
        lectura.close();
    }

}

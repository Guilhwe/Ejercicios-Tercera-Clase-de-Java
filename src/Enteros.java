import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = lectura.nextInt();
        if (num < 0){
            System.out.println("El número es negativo");
        } else if (num > 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es cero");
        }
        lectura.close();
    }
}

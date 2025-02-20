import java.util.Scanner;

public class ParesONones {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = lectura.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        }else{
            System.out.println("El número " + num + " es impar");
        }
        lectura.close();
    }

}

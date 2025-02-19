import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = lectura.nextInt();
        System.out.println("Tabla de multiplicar del número " + num + " del 1 al 10 es");
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + num + " = " + num * i);
        }
    }
}

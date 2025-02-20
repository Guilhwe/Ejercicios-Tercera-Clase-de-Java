import java.util.Scanner;

public class Opciones {
public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    System.out.println("Selecciona una opción: ");
    System.out.println("1. Calcule el area del cuadrado");
    System.out.println("2. Calcule el area del círculo");
    System.out.println("Introduce otro numero para salir");
    int opcion = lectura.nextInt();
    if (opcion == 1){
        System.out.println("Introduce el lado del cuadrado en centímetros (debe ser un numero entero positivo): ");
        int lado = lectura.nextInt();
        int area = lado * lado;
        System.out.println("El área del cuadrado es: " + area + "cm cuadrados");
    } else if (opcion == 2){
        System.out.println("Introduce el radio del círculo en centímetros (debe ser un numero entero positivo): ");
        double radio = lectura.nextDouble();
        double area = 3.14* radio * radio;
        System.out.println("El área del círculo es: " + area +"cm cuadrados");
        
    } else {
        System.out.println("Programa finalizado");
    }
    lectura.close();
}
}

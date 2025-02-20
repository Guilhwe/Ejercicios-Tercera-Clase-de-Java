import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        String numsString = lectura.nextLine();
        if (isEntero(numsString) == false) {
            System.out.println("El valor introducido no es un número entero");
            System.exit(0);
            
        }
        int num = Integer.parseInt(numsString);
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);
        lectura.close();    
    }
    public static boolean isEntero(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}

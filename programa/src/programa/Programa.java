package programa;
import java.util.Scanner;
public class Programa 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los 5 números
        int[] numeros = new int[5];

        // Solicitar al usuario que ingrese 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números ingresados
        System.out.println("Números ingresados:");

        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
    }
    
}

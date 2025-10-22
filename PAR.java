import java.util.Scanner;


import java.util.Scanner;

public class PAR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduce un valor entero: ");
        int valor = entrada.nextInt();

        boolean esPar = (valor % 2 == 0);

        if (esPar) {
            System.out.println("El valor ingresado es un número PAR.");
        } else {
            System.out.println("El valor ingresado es un número IMPAR.");
        }
        System.out.println(esPar);

    }
}

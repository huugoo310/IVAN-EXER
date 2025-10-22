import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Enunciado = "CALCULADOR DE PESO IDEAL";
        System.out.println(Enunciado);

        System.out.println("Indica tu Altura(cm):");
        int altura = sc.nextInt();
        System.out.println("Tu Altura" + " " + altura);

        System.out.println("Indica tu Peso(kg):");
        int peso = sc.nextInt();
        System.out.println("Tu Peso" + " " + peso);

        int total = altura - 100;

      System.out.println("Tu peso ideal es de " + " " + total + "kg");
      int diferencia = total - peso;
      System.out.println("Te quedan " + diferencia + "kg" + " " + "para llegar a tu peso corporal ideal");


    }
}

import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca 3 números enteros: ");

        Double a = entrada.nextDouble();
        Double b = entrada.nextDouble();
        Double c = entrada.nextDouble();

        double minimo = (b>c) ? Math.min(a , c): Math.min(a , b);
        double maximo = (b<c) ? Math.max(a , c): Math.max(a , b);
        double media = (a + b +c)/3;

        System.out.println("mínimo = " + minimo);
        System.out.println("máximo = " + maximo);
        System.out.println("media = " + media);


    }
}

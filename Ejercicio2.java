import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una temperatura en grados centígrados: ");

        Double temperaturaC = entrada.nextDouble();

        System.out.println("Introduzca F ó K según quiera convertir la temperatura en grados Fahrenheit ó Kelvin: ");

        Double temperaturaF = (9/5) * temperaturaC + 32;

        Double temperaturaK = temperaturaC + 273.15;

        System.out.println(temperaturaF);
        System.out.println(temperaturaK);


    }
}

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una temperatura en grados centígrados: ");

        Double temperaturaC = entrada.nextDouble();

        System.out.println("Introduzca F ó K según quiera convertir la temperatura en grados Fahrenheit ó Kelvin: ");

        String tipo = entrada.next();

        Double temperaturaF = (9/5) * temperaturaC + 32;

        Double temperaturaK = temperaturaC + 273.15;

        Double resultado;
        resultado = ((tipo == "F") ? temperaturaF : ((tipo == "K") ? temperaturaK : "Error"));

        System.out.println("La temperatura en grados Fahrenheit es: " + temperaturaF);
        System.out.println("La temperatura en grados Kelvin es: " + temperaturaK);


    }
}

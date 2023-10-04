import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca número de pizzas: ");

        int pizzas = entrada.nextInt();

        System.out.println("Introduzca número de amigos: ");

        int amigos = entrada.nextInt();

        System.out.println("Introduzca número de porciones en que se divide cada pizza: ");

        int porciones = entrada.nextInt();

        int porcionesPersona = (pizzas * porciones)/amigos;

        int sobra = (pizzas * porciones) % amigos;

        System.out.println("Cada amigo tocará a " + porcionesPersona + " porciones.");
        System.out.println("Sobrarán " + sobra + " porciones. ");



    }
}

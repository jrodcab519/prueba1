import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca 3 números reales: ");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();


        double apartadoA = a*b + c*((3-a)/(2*b));
        double apartadoB = ((2+a*b)/4)+(Math.pow(c,1) + 2);
        double apartadoC = -b+(Math.sqrt(b+Math.pow(b,2)-4*a*c))/2*a;



        System.out.println("el resultado del apartado a es: " + apartadoA);
        System.out.println("el resultado del apartado b es: " + apartadoB);
        System.out.println("el resultado del apartado c es: " + apartadoC);
    }
}

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca 3 números reales: ");

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int apartadoA = a*b + c*((3-a)/(2*b));
        int apartadoB = ((2+a*b)/4)^(c+2);
        // como no se como poner la raíz cuadrada la obvio //
        int apartadoC = (-b+(b-4*a*c))/2*a;



        System.out.println("el resultado del apartado a es: " + apartadoA);
        System.out.println("el resultado del apartado b es: " + apartadoB);
        System.out.println("el resultado del apartado c es: " + apartadoC);
    }
}

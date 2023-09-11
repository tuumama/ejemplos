import java.util.Scanner;

public class CalculadoraIntereses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de intereses");
        System.out.print("Ingrese el monto principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaInteres = scanner.nextDouble() / 100;

        System.out.print("Ingrese el número de años: ");
        int años = scanner.nextInt();

        System.out.println("Elija el tipo de interés:");
        System.out.println("1. Interés simple");
        System.out.println("2. Interés compuesto");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double interesTotal;

        switch (opcion) {
            case 1:
                interesTotal = calcularInteresSimple(principal, tasaInteres, años);
                break;
            case 2:
                interesTotal = calcularInteresCompuesto(principal, tasaInteres, años);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("El interés total es: " + interesTotal);
    }

    public static double calcularInteresSimple(double principal, double tasaInteres, int años) {
        return principal * tasaInteres * años;
    }

    public static double calcularInteresCompuesto(double principal, double tasaInteres, int años) {
        return principal * Math.pow(1 + tasaInteres, años) - principal;
    }
}

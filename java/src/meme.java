import java.util.Scanner;

public class meme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso : ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Tu (IMC) es: " + imc);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}

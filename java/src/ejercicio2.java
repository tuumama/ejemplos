import java.util.Scanner;
public class ejercicio2{
    public static void main(String[] args) {
        Scanner lol= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n1=lol.nextInt();
        System.out.println("Ingresa el segundo numero");
        int n2=lol.nextInt();
        if (n1>0 && n2>0){
            System.out.println("El primer numero que ingresaste es positivo y es: " + n1);
            System.out.println("El segundo numero que ingresaste es positivo y es: " + n2);
        } else if(n1>0 || n2>0){
            System.out.println("El primer numero que ingresaste es positivo y es: " + n1);
            System.out.println("El primer numero que ingresaste es negativo y es: " + n2);
        }
    } 
}
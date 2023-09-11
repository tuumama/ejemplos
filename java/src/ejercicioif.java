import java.util.Scanner;
public class ejercicioif{
    
    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
        System.out.println("Ingresa un numero");
        int n1=leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        int n2=leer.nextInt();
        if(n1>0 && n2>0){
            System.out.println("El primer numero es numero es positivo y es: " + n1);
            System.out.println("El segundo numero es numero es positivo y es: " + n2);
        } else if(n1<0 && n2<0){
            System.out.println("El numero es negativo perro y es: " + n1);
            System.out.println("El numero es negativo perro y es: " + n2);
        }
        System.out.println("Habeis terminado tio, flipass");
    }
    }
import java.util.*;
public class numeros {
    public static void main(String[] args) {
        Scanner lol =new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int a  = lol.nextInt();
        if(a>0){
            System.out.print("Introduciste un numero positivo");
        } else {
            System.out.print("Introduciste un numero negativo");
        }
    }
}
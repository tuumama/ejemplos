import java.util.Scanner;
public class Practica2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String C1 = sc.nextLine();
        String C2 = sc.nextLine();
        if (C1.equals(C2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}
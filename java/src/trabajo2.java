import java.util.Scanner;
public class trabajo2 {
    public static void main(String[] args) {
        Scanner tr= new Scanner(System.in);
        int exp;
        String titulo;
        System.out.println("¿Tienes titulo?");
        titulo=tr.nextLine();
        System.out.println("¿Cuantos años tienes de experiencia laboral?");
        exp=tr.nextInt();
        if(exp>=3 && titulo!="Si" ||titulo!="No"){
            System.out.println("En horabuena, has sido aceptado");
        }else{
            System.out.println("Suerte para la proxima");
        }
    }
}
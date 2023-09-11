import java.util.Scanner;
public class Trabajo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int exp;
        String titulo;
        String y="Yes";
        String n="No";
        
            System.out.print("¿Tienes titulo?: ");
            titulo=sc.nextLine();
            System.out.print("¿Años de experiencia?: ");
            exp=sc.nextInt();
            while((exp>=3)&&(titulo!="y")){
            System.out.print("Bienvenido al equipo papi");
            }
            System.out.print("No eres bienvenido al equipo papi");
        }
    }
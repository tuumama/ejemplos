import java.util.Scanner;
public class loginprueba {
    public static void main(String[] args) {
     Scanner leer= new Scanner (System.in);
     int login=0;
     int pass=0;
     int intentos=1;
     int maximo=2;
     while((login!=007)||(pass!=2486)&&(intentos<maximo)){
        System.out.print("Ingresa numero de usuario: ");
            login=leer.nextInt();
        System.out.print("Ingresa su contraseña: ");
            pass=leer.nextInt();
        if(intentos==2){
        System.out.print("Error de acceso");
        intentos=intentos-maximo;
        }
        intentos++;
        System.out.print("Entrando");
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){   
        } 
    }
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.print("Menu");
    }
}
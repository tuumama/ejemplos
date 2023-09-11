import java.util.Scanner;
public class contraseña{
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa tu contraseña");
        String password= leer.nextLine();
        if(password.length()>=10 && password.length()<=20){
            boolean valido=false;
            for(int i=0; i<password.length(); i++){
                if(password.charAt(i)=='*' || password.charAt(i)=='-' || password.charAt(i)=='_'){
                    valido=true;
                }
            } if(valido){
                System.out.println("Tu contraseña es correcta papi");
            } else{
                System.out.println("Tu contraseña no es correcta papi");
            }
        } else{
            System.out.println("Tu contraseña es inválida");
        }
    }
}
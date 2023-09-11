import java.util.Scanner;
public class login {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int login=0;
		int pass=0;
		int intentos=1;
		int maximo=3;
			while((login!=3312)||(pass!=1234)&&(intentos<maximo)){
				System.out.print("Ingrese su numero de usuario: ");
				login=teclado.nextInt();
				System.out.print("Ingrese su contraseña: ");
				pass=teclado.nextInt();
				if(intentos==3){
					System.out.println("Acceso denegado.");
					intentos=intentos-maximo;
				}
				intentos++;
			}
			System.out.println("Accediendo.");
		    try{
                Thread.sleep(3000);
                }catch(InterruptedException e ) {
            }
			System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Menu");
	}
}
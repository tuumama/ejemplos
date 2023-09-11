import javax.swing.*;
public class aa_aa extends proyecto.variables{
    public static void main(String[] args) {
        String[] opciones = {
            "TARJETA DE CREDITO",
            "CUENTA",
            "AYUDA Y SOPORTE",
        };
        int resp = (int) JOptionPane.showInputDialog(null, "Seleccione una opcion", "", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        if(resp==0){
            String tarjeta=JOptionPane.showInputDialog("Ingrese su numero de tarjeta");  
        }
    }
    public void variables(long t1, long t2, long t3, long t4){
        //if(t1.equals(tarjeta)==false){

    }
}
//}
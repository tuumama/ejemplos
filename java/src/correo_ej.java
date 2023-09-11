import javax.swing.*;

public class correo_ej {
    public static void main(String[] args) {
        int arroba=0;
        boolean punto=false;
        String correo=JOptionPane.showInputDialog("introduce tu correo:");
        for(int a=1; a<correo.length();a++){ 
            if(correo.charAt(a)=='@'){
                arroba++;
            }
            if(correo.charAt(a)=='.'){
                punto=true;
            }
        }
        if(punto==true){
        }if(arroba==1){
                JOptionPane.showMessageDialog(null, "El correo es correcto", "", JOptionPane.PLAIN_MESSAGE);
        }else{
                JOptionPane.showMessageDialog(null, "El correo es incorrecto", "", JOptionPane.PLAIN_MESSAGE);
            }
        }

    }


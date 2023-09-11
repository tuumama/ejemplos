
import javax.swing.*;

public class calculadora {
    public static void main(String[] args) {
        String clave="eva01", contra="";
        ImageIcon icon= new ImageIcon("x.png");
        ImageIcon icon2= new ImageIcon("pal.png");
        while(clave.equals(contra)==false){
            contra=JOptionPane.showInputDialog(null, "Ingresa la contraseña", "CONTRASEÑA", JOptionPane.PLAIN_MESSAGE);
            if(clave.equals(contra)==false){
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta", "ERROR", JOptionPane.PLAIN_MESSAGE, icon);
}
}       JOptionPane.showMessageDialog(null, "La contraseña es correcta", "CORRECTO", JOptionPane.PLAIN_MESSAGE, icon2);
        ImageIcon icon3= new ImageIcon("cat.png");
        ImageIcon icon4= new ImageIcon("icon.png");
        ImageIcon icon5= new ImageIcon("jedi.png");
        int resultado, a;
        JOptionPane.showMessageDialog(null, "CALCULADORA DE OPERACIONES BASICAS", "BIENVENIDO/A", JOptionPane.PLAIN_MESSAGE, icon3);
        String name=JOptionPane.showInputDialog(null, "Ingresa tu nombre", "USUARIO", JOptionPane.PLAIN_MESSAGE);
        do {
            String[] options = {"Suma", "Resta", "Multiplicacion", "Division"};
            int op = JOptionPane.showOptionDialog(null, "Elige una opcion", "OPCIONES", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon3, options, options[0]);
            String n1=JOptionPane.showInputDialog(null,"Ingresa el primer numero","", JOptionPane.PLAIN_MESSAGE);
            String n2=JOptionPane.showInputDialog(null, "Ingresa el segundo numero", "", JOptionPane.PLAIN_MESSAGE);
            int v1=Integer.parseInt(n1);
            int v2=Integer.parseInt(n2);

            if(op==0){
                resultado=v1+v2;
                JOptionPane.showMessageDialog(null, "La suma es: "+ resultado, "RESULTADO", JOptionPane.PLAIN_MESSAGE, icon4);
                JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras", "LETRAS", JOptionPane.PLAIN_MESSAGE, icon5);
            }else if(op==1){
                resultado=v1-v2;
                JOptionPane.showMessageDialog(null, "La resta es: "+ resultado, "RESULTADO", JOptionPane.PLAIN_MESSAGE, icon4);
                JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras", "LETRAS", JOptionPane.PLAIN_MESSAGE, icon5);
            }else if(op==2){
                resultado=v1*v2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ resultado, "RESULTADO", JOptionPane.PLAIN_MESSAGE, icon4);
                JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras", "LETRAS", JOptionPane.PLAIN_MESSAGE, icon5);
            }else{
                resultado=v1/v2;
                JOptionPane.showMessageDialog(null, "La division es: "+ resultado, "RESULTADO", JOptionPane.PLAIN_MESSAGE, icon4);
                JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras", "LETRAS", JOptionPane.PLAIN_MESSAGE, icon5); 
            }
            String[] opt = {"si", "no"};
            a = JOptionPane.showOptionDialog(null, "¿Deseas realizar otra operacion?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon3, opt, opt[0]);
            
        } while (a==0); 
}

}

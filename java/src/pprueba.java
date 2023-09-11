import javax.swing.*;
public class pprueba{
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("cat.png");
        int resultado;
        String name=JOptionPane.showInputDialog(null, "Ingresa tu nombre", "USUARIO", JOptionPane.PLAIN_MESSAGE);
String[] options = {"suma", "resta", "multi", "division"};
int op = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
String n1=JOptionPane.showInputDialog(null,"Ingresa el primer numero","NUMEROS", JOptionPane.PLAIN_MESSAGE);
            String n2=JOptionPane.showInputDialog(null, "Ingresa el segundo numero", "NUMEROS", JOptionPane.PLAIN_MESSAGE);
            int v1=Integer.parseInt(n1);
            int v2=Integer.parseInt(n2);
            if(op==0){
                resultado=v1+v2;
                JOptionPane.showMessageDialog(null, "La suma es: "+ resultado, "RESULTADO", JOptionPane.PLAIN_MESSAGE, icon);
                JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras", "LETRAS", JOptionPane.PLAIN_MESSAGE, icon);
            }else if(op==1){
                resultado=v1-v2;
                JOptionPane.showMessageDialog(null, "La resta es: "+ resultado, "RESULTADO", JOptionPane.PLAIN_MESSAGE, icon);
                JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras", "LETRAS", JOptionPane.PLAIN_MESSAGE, icon);
            }else if(op==2){
                resultado=v1*v2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ resultado, "RESULTADO", JOptionPane.PLAIN_MESSAGE, icon);
                JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras", "LETRAS", JOptionPane.PLAIN_MESSAGE, icon);
            }else{
                resultado=v1/v2;
                JOptionPane.showMessageDialog(null, "La division es: "+ resultado, "RESULTADO", JOptionPane.PLAIN_MESSAGE, icon);
                JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras", "LETRAS", JOptionPane.PLAIN_MESSAGE, icon); 
            }

  
}
}
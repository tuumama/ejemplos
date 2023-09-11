import javax.swing.*;

public class basicas {
    public static void main(String[] args) throws Exception {
        ImageIcon icon= new ImageIcon("icon.jpg");
        int resultado;
        JOptionPane.showMessageDialog(null, "BIENVENIDO/A A LA CALCULADORA DE OPERACIONES BASICAS");
        String name=JOptionPane.showInputDialog("Ingresa tu nombre");
        String opt=JOptionPane.showInputDialog("Hola "+ name + " elige una opcion: \n 1 suma \n 2 resta \n 3 multiplicacion \n 4 division");
        int op=Integer.parseInt(opt);
        String n1=(String)JOptionPane.showInputDialog(null,"Ingresa el primer numero" , "hola");
        String n2=JOptionPane.showInputDialog("Ingresa el segundo numero");
        int v1=Integer.parseInt(n1);
        int v2=Integer.parseInt(n2);
        if(op==1){
            resultado=v1+v2;
            JOptionPane.showMessageDialog(null, "La suma es: "+ resultado, "res", JOptionPane.PLAIN_MESSAGE, icon);
            JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras");
        }else if(op==2){
            resultado=v1-v2;
            JOptionPane.showMessageDialog(null, "La resta es: "+ resultado);
            JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras");
        }else if(op==3){
            resultado=v1*v2;
            JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ resultado);
            JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras");
        }else{
            resultado=v1/v2;
            JOptionPane.showMessageDialog(null, "La division es: "+ resultado);
            JOptionPane.showMessageDialog(null, name +" tu nombre tiene "+ name.length() +" letras"); 
}
}
}

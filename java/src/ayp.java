import javax.swing.*;
public class ayp {
    public static void main(String[] args) {
        int perimetro, area;
        double peri,are, pi=3.1416;
        JOptionPane.showMessageDialog(null, "BIENVENIDO/A A LA CALCULADORA DE AREA Y PERIMETRO");
        String name=JOptionPane.showInputDialog("Ingresa tu nombre");
        String opt=JOptionPane.showInputDialog("Hola "+ name + " elige una opcion: \n 1 cuadrado \n 2 rectangulo \n 3 circulo");
        int op=Integer.parseInt(opt);
        if(op==1){
            String n1=JOptionPane.showInputDialog("Ingresa el valor de un lado");
            int v1=Integer.parseInt(n1);
            perimetro=v1+v1+v1+v1;
            area=v1*v1;
            JOptionPane.showMessageDialog(null, "El perimetro es: "+ perimetro);
            JOptionPane.showMessageDialog(null, "El area es: "+ area);
        }else if(op==2){
            String n1=JOptionPane.showInputDialog("Ingresa el valor de la base");
            String n2=JOptionPane.showInputDialog("Ingresa el valor de la altura");
            int v1=Integer.parseInt(n1);
            int v2=Integer.parseInt(n2);
            perimetro=v1+v2+v1+v2;
            area=v1*v2;
            JOptionPane.showMessageDialog(null, "El perimetro es: "+ perimetro);
            JOptionPane.showMessageDialog(null, "El area es: "+ area);
        }else{
            String n1=JOptionPane.showInputDialog("Ingresa el valor del radio");
            int v1=Integer.parseInt(n1);
            peri=2*pi*v1;
            are=v1*v1*pi;
            JOptionPane.showMessageDialog(null, "El perimetro es: "+ peri);
            JOptionPane.showMessageDialog(null, "El area es: "+ are);
        }   
    }  
}

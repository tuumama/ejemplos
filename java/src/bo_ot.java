import java.time.LocalDate;

import javax.swing.JOptionPane;

public class bo_ot {
    public static void main(String[] args) {
        String nombre="Asistente";
        saludar(nombre, LocalDate.now().getYear());
        
    }
    static void saludar(String nombre, int año){
        JOptionPane.showMessageDialog(null, "Hola soy el  "+ nombre+"\n estoy aqui para ayudarte a resolver tus dudas");

    }

}

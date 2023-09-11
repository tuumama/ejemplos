import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class celulares {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("samsung.jpg");
        ImageIcon iconp = new ImageIcon("xiaomi.jpg");
        int opc = JOptionPane.showOptionDialog(null, "Elija una opcion", "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "Xiaomi", "Samsung" }, "Xiaomi");

        if (opc == 0) {
            JOptionPane.showMessageDialog(null, "PANTALLA: AMOLED 6,43 Full HD+ 90 Hz Respuesta táctil 180 Hz \n" +
                    "DIMENSIONES Y PESO: 159,87 x 73,87 x 8,09 mm179 g.\n" +
                    "PROCESADOR: Snapdragon 680\n" +
                    "RAM: 4 / 6 GB\n" +
                    "ALMACENAMIENTO: 64 / 128 GB MicroSD hasta 1 TB\n" +
                    "CÁMARA FRONTAL: 13 MP f/2.4\n" +
                    "CÁMARA TRASERA: 50 MP f/1.8 8 MP f/2.2 UGA 2 MP f/2.4 macro 2 MP f/2.4 bokeh\n" +
                    "BATERÍA: 5.000 mAh Carga rápida 33W\n" +
                    "SISTEMA OPERATIVO: Android 11 MIUI 13\n" +
                    "CONECTIVIDAD: 4G LTE Wi-Fi ac Bluetooth 5.0 NFC IR Blaster Minijack\n" +
                    "PRECIO: Desde 179,99 euros", "CARACTERISTICAS", JOptionPane.PLAIN_MESSAGE, iconp);

        } else if (opc == 1) {

            JOptionPane.showMessageDialog(null, "PANTALLA: AMOLED 6,43 Full HD+ 90 Hz Respuesta táctil 180 Hz \n" +
                    "DIMENSIONES Y PESO: 159,87 x 73,87 x 8,09 mm179 g.\n" +
                    "PROCESADOR: Snapdragon 680\n" +
                    "RAM: 4 / 6 GB\n" +
                    "ALMACENAMIENTO: 64 / 128 GB MicroSD hasta 1 TB\n" +
                    "CÁMARA FRONTAL: 13 MP f/2.4\n" +
                    "CÁMARA TRASERA: 50 MP f/1.8 8 MP f/2.2 UGA 2 MP f/2.4 macro 2 MP f/2.4 bokeh\n" +
                    "BATERÍA: 5.000 mAh Carga rápida 33W\n" +
                    "SISTEMA OPERATIVO: Android 11 MIUI 13\n" +
                    "CONECTIVIDAD: 4G LTE Wi-Fi ac Bluetooth 5.0 NFC IR Blaster Minijack\n" +
                    "PRECIO: Desde 179,99 euros", "CARACTERISTICAS", JOptionPane.PLAIN_MESSAGE, icon);

        }

    }
}

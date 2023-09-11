package proyecto;

import javax.swing.*;

public class cajero_automatic {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "CAJERO AUTOMATICO BMGBA", "BIENVENIDO", JOptionPane.PLAIN_MESSAGE);
        String[] op = { "NUMERO DE TARJETA", "CODIGO", "CLABE" };
        int opc = JOptionPane.showOptionDialog(null, "Elija una opcion", "", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
        String nip = JOptionPane.showInputDialog("Ingresa tu NIP");
        if (nip.equals("3691")) {

            double saldo = 3500;
            String opcion = "0";

            while (!opcion.equals("4")) {
                String[] opt = { "CONSULTAR SALDO", "REALIZAR DEPOSITO", "RETIRAR EFECTIVO", "SALIR" };
                int optt = JOptionPane.showOptionDialog(null, "Elija una opcion", "", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);

                switch (optt) {
                    case 0: {
                        JOptionPane.showMessageDialog(null, "Su saldo es de: " + Double.toString(saldo));
                        break;
                    }
                    case 1: {
                        String depositoo = JOptionPane.showInputDialog(null, "Ingresa el monto");
                        int deposito = Integer.parseInt(depositoo);
                        if (deposito > 0) {
                            saldo = saldo + deposito;
                            JOptionPane.showMessageDialog(null, saldo);
                        } else {
                            JOptionPane.showMessageDialog(null, "Monto incorrecto", "ERROR", JOptionPane.PLAIN_MESSAGE);

                        }
                        break;

                    }
                    case 2: {
                        String moto = JOptionPane.showInputDialog(null, "Ingrese el monto a retirar");
                        int monto = Integer.parseInt(moto);
                        if (monto <= saldo) {
                            saldo = saldo - monto;
                            JOptionPane.showMessageDialog(null, saldo);

                        } else {
                            JOptionPane.showMessageDialog(null, "No se puede retirar un monto mayor a su saldo");

                        }
                        break;
                    }
                    case 3: {
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                        break;
                    }
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "PIN incorrecto");
        }
    }
}

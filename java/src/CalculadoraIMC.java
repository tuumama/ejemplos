import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class CalculadoraIMC extends JFrame {
    private JPanel panel;
    private JLabel pesoLabel;
    private JTextField pesoTextField;
    private JLabel alturaLabel;
    private JTextField alturaTextField;
    private JButton calcularButton;
    private JLabel resultadoLabel;

    public CalculadoraIMC() {
        setTitle("Calculadora IMC");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        pesoLabel = new JLabel("Peso (kg): ");
        pesoTextField = new JTextField();
        alturaLabel = new JLabel("Altura (m): ");
        alturaTextField = new JTextField();
        calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel("");

        panel.add(pesoLabel);
        panel.add(pesoTextField);
        panel.add(alturaLabel);
        panel.add(alturaTextField);
        panel.add(calcularButton);
        panel.add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void calcularIMC() {
        try {
            double peso = Double.parseDouble(pesoTextField.getText());
            double altura = Double.parseDouble(alturaTextField.getText());

            double imc = peso / (altura * altura);

            String mensaje = "Tu IMC es: " + String.format("%.2f", imc);
            resultadoLabel.setText(mensaje);
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Ingresa valores válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraIMC();
            }
        });
    }
}

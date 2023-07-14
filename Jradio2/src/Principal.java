import javax.swing.*;
import java.awt.event.*;

public class Principal {
    private JPanel Principal;
    private JButton resultadoButton;
    private JRadioButton enteroRadioButton;
    private JRadioButton decimalRadioButton;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Principal() {
        resultadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos de texto
                String valor1 = textField1.getText();
                String valor2 = textField2.getText();
                // Convertir los valores a números
                double num1 = Double.parseDouble(valor1);
                double num2 = Double.parseDouble(valor2);
                // Sumar los números
                double resultado = num1 + num2;
                if (decimalRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                } else if (enteroRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "El resultado es: " + (int) resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor seleccione una opción.");
                }
            }
        });
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo extends JFrame{
    private JCheckBox chevroletCheckBox;
    private JCheckBox nissanCheckBox;
    private JCheckBox kiaCheckBox;
    private JCheckBox aveoCheckBox;
    private JPanel Vehiculos;
    private JButton guardarButton;

    public Ejemplo() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog("SE HA GUARDADO CON EXITO!! ¿Que le parecio la encuesta?: ");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo");
        frame.setContentPane(new Ejemplo().Vehiculos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones {
    private JPanel Fondo;
    private JPanel Caja;
    private JPasswordField passwordField2;
    private JButton Salida;
    private JButton Mostrar;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Botones");
        frame.setContentPane(new Botones().Fondo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Botones() {

    passwordField2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });

        Salida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField2.setEchoChar((char)0);
            }
        });
    }
}

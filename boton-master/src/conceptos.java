import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class conceptos {
    private JTextField primer_txt;
    private JPanel rootpanel;
    private JLabel titulo;
    private JProgressBar progressBar1; //este boton nos da una barra de carga
    private JTree tree1; // este boton nos indica un directorio de archivos
    private JLabel TXT;
    private JRadioButton btn_carga;

    public conceptos() {
        btn_carga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Incrementar el valor de la barra de progreso en un 10%
                int valorActual = progressBar1.getValue();
                int nuevoValor = valorActual + 10;
                progressBar1.setValue(nuevoValor);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("conceptos");
        frame.setContentPane(new conceptos().rootpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
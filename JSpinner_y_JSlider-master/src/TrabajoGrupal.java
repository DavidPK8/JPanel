import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class TrabajoGrupal extends JFrame {
    private JSpinner spinTgl;
    private JSlider selector;
    private JPanel mostrador;
    private JLabel salida;

    public TrabajoGrupal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 100);
        mostrador = new JPanel();
        mostrador.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(mostrador);
        mostrador.setLayout(new GridLayout(2, 1));

        JLabel lblTanggal = new JLabel("Fecha: ");
        mostrador.add(lblTanggal);

        spinTgl = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEdit = new JSpinner.DateEditor(spinTgl, "dd/MMM/yyyy HH:mm:ss");
        spinTgl.setEditor(dateEdit);
        spinTgl.setValue(new java.util.Date());
        mostrador.add(spinTgl);

        selector = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        salida = new JLabel("0");
        mostrador.add(salida);

        selector.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                salida.setText(String.valueOf(selector.getValue()));
            }
        });
        mostrador.add(selector);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TrabajoGrupal frame = new TrabajoGrupal();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}

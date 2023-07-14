import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class clase_combo {
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JLabel TextDisplay1;
    private JPanel root;
    private JLabel edad3;
    private JScrollBar scrollBar1;
    private JLabel edad_dato;

    String aux = null;
    public clase_combo() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                edad_dato.setText(String.valueOf(scrollBar1.getValue()));
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("clase_combo");
        frame.setContentPane(new clase_combo().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

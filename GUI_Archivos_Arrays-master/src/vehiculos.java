import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class vehiculos {
    private JTextField tfield1;
    private JTextField tfield2;
    private JTextField tfield3;
    private JTextField tfield4;
    private JLabel m;
    private JLabel vevhiculoLabel;
    private JLabel cilinLabel;
    private JLabel title;
    private JLabel anioLabel;
    private JPanel rootPanel;
    private JButton back_button;
    private JButton front_button;
    private JTextPane panel;
    private JLabel mostrar_text;

    String file_dir = "datos.txt";

    //Definimos el array de objetos
    crearObjetos autos[] = new crearObjetos[4];

    public vehiculos() {

        front_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Instanciamos un objeto nuevo por cada guardar
                for(int i = 0; i< autos.length; i++){
                    autos[i] = new crearObjetos(tfield1.getText(),tfield2.getText(),
                            tfield3.getText(), tfield4.getText());
                }
                try (FileOutputStream fileOut = new FileOutputStream(file_dir);
                     ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                ) {

                    objectOut.writeObject(autos);
                    System.out.println("Archivo escrito correctamente");

                }catch (IOException x){
                    throw new RuntimeException(x);
                }
            }
        });
        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar_text.setVisible(true);
                panel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario Registro de Vehiculos");
        frame.setContentPane(new vehiculos().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.setResizable(false);
    }
}

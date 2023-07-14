import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Formulario {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel rootPanel;
    private JLabel Nombre;
    private JLabel Cedula;
    private JLabel Edad;
    private JButton Cargar;
    private JButton Guardar;
    private JButton Limpiar;
    private JButton Finalizar;

    public Formulario() {
        String filePath = "datos.dat";
        Cargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try(
                        FileInputStream fileIn = new FileInputStream(filePath);
                        ObjectInputStream objIn = new ObjectInputStream(fileIn);
                ){
                    MiClase readObject = (MiClase) objIn.readObject();
                    /*System.out.println("El objeto en disco es: " + readObject);
            System.out.println(readObject.getEdad());
            System.out.println(readObject.getNombre());*/
                    textField1.setText(textField1.getText() + readObject.getNombre());
                    textField2.setText(textField2.getText() + readObject.getCedula());
                    textField3.setText(textField3.getText() + readObject.getEdad());
                }catch (IOException a){
                    throw new RuntimeException();
                }catch (ClassNotFoundException a){
                    throw new RuntimeException(a);
                }
            }
        });
        Guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiClase miObjeto = new MiClase("Jorge", "175180808099", 24);
                miObjeto.setNombre(textField1.getText());
                miObjeto.setCedula(textField2.getText());
                int edadA = Integer.parseInt(textField3.getText());
                miObjeto.setEdad(edadA);
                try (FileOutputStream fileOut = new FileOutputStream(filePath);
                     ObjectOutputStream obOut = new ObjectOutputStream(fileOut);
                ) {
                    obOut.writeObject(miObjeto);
                    System.out.println("Archivo escrito correctamente");
                } catch (IOException d) {
                    throw new RuntimeException(d);
                }
            }
        });
        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        Finalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setContentPane(new Formulario().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

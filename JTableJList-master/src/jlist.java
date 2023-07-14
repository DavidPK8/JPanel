import javax.swing.*;

public class jlist {
    private JList<String> list1;
    private JPanel panel1;

    public jlist() {
        // Crear el modelo de datos para la lista
        String[] data = {"Manzana", "Banana", "Cereza", "Dátil", "Elderberry"};
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String item : data) {
            model.addElement(item);
        }

        // Asignar el modelo de datos a la lista
        list1.setModel(model);
    }

    //Main
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JList");
        frame.setContentPane(new jlist().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


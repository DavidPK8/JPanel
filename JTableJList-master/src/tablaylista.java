import javax.swing.*;
import java.awt.event.ComponentAdapter;

public class tablaylista {

    private JTable table1;

    private JPanel tablalista;


    public tablaylista() {
        // Crear los datos de la tabla
        Object[][] data = {
                {"Juan", "Pérez", "jperez@gmail.com"},
                {"María", "García", "mgarcia@hotmail.com"},
                {"Pedro", "López", "plopez@yahoo.com"},
                {"Ana", "Martínez", "amartinez@gmail.com"},
                {"Luis", "Hernández", "lhernandez@hotmail.com"}
        };

        // Crear los nombres de las columnas
        String[] columnNames = {"Nombre", "Apellido", "Email"};

        // Crear la tabla con los datos y los nombres de las columnas
        table1 = new JTable(data, columnNames);
    }

    public static void main(String[] args) {
        tablaylista example = new tablaylista();
        // Crear JScrollPane y agregar la tabla
        JScrollPane scrollPane = new JScrollPane(example.table1);
        // Agregar el JScrollPane al JFrame
        JFrame frame = new JFrame("tablaylista");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}

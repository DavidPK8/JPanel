import javax.swing.*;

public class Separator  {
    Separator() {
        // create a frame
        JFrame f = new JFrame("Separator");

        // create a menubar
        JMenuBar mb = new JMenuBar();

        // create a menu
        JMenu m = new JMenu("Menu");

        // create menuitems
        JMenuItem m1 = new JMenuItem("Item 1");
        JMenuItem m2 = new JMenuItem("Item 2");

        // add menuitems
        m.add(m1);
        m.addSeparator();
        m.add(m2);

        // add menu
        mb.add(m);

        f.setJMenuBar(mb);

        // show the frame
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

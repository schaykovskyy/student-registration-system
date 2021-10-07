import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void buildCoursesLayout(Container pane) {

        JButton button;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
 
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        l1.addElement("Item2");
        l1.addElement("Item3");

        JList<String> list = new JList<>(l1);

        if (shouldWeightX) {
        c.weightx = 0.5;
        }
        JLabel label = new JLabel("STUDENT COURSES");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JScrollPane(list),c);

        button = new JButton("Delete Course");
        c.gridx = 0; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(button, c);
    }
    public static void buildCatalogLayout(Container pane) {

        JButton button;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
 
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        l1.addElement("Item2");
        l1.addElement("Item3");

        JList<String> list = new JList<>(l1);

        if (shouldWeightX) {
        c.weightx = 0.5;
        }
        JLabel label = new JLabel("CATALOG");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JScrollPane(list),c);

        button = new JButton("Search");
        c.gridx = 0; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(button, c);

        JTextField searchField = new JTextField("course name");
        c.gridx = 1; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(searchField,c);
    }
    public static void buildStudentLayout(Container pane) {

        JButton button;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
 
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("JOE");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        l1.addElement("Item2");
        l1.addElement("Item3");

        JList<String> list = new JList<>(l1);

        if (shouldWeightX) {
        c.weightx = 0.5;
        }
        JLabel label = new JLabel("STUDENT");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JScrollPane(list),c);

        button = new JButton("+");
        c.gridx = 0; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(button, c);

        button = new JButton("-");
        c.gridx = 1; // aligned with button 2
        c.gridy = 2; // third row
        pane.add(button, c);
    }
    public static void buildSectionLayout(Container pane) {

        JButton button;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
 
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        l1.addElement("Item2");
        l1.addElement("Item3");

        JList<String> list = new JList<>(l1);

        if (shouldWeightX) {
        c.weightx = 0.5;
        }
        JLabel label = new JLabel("SECTIONS");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JScrollPane(list),c);

        button = new JButton("Add Course");
        c.gridx = 0; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(button, c);
    }

    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Student Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the content pane.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
        buildStudentLayout(panel1);
        buildCoursesLayout(panel2);
        buildCatalogLayout(panel3);
        buildSectionLayout(panel4);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // creating and showing this application's GUI.
        createAndShowGUI();
    }
}
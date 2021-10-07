import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
// student
    public JLabel studentTitle = new JLabel("STUDENT");
    // public DefaultListModel<Student> defModel = new DefaultListModel<Student>(); 
    // public JList<Student> studentsList = new JList<Student>(defModel);
    public JList<Student> studentsList = new JList<Student>();
    public JButton addStudentBtn = new JButton("+");
    public JButton removeStudentBtn = new JButton("-");

//Student courses
    public JLabel enrolledCoursesTitle = new JLabel("Enrolled Courses");
    public JList<Course> enrolledCoursesList= new JList<Course>();
    public JButton removeEnrolledCourseBtn= new JButton("Remove Course");
//Catalog
    public JLabel catalogTitle= new JLabel("Catalog");
    public JList<String> catalogList= new JList<>();
    public JButton searchBtn= new JButton("Search");
    public JTextField searchField= new JTextField("search for course");
// Section
    public JLabel sectionTitle= new JLabel("Sections");
    public JList<String> sectionList= new JList<>();
    public JButton addCourseBtn= new JButton("Add course");

    public void buildStudentLayout(Container pane) {

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
 
        c.weightx = 0.5;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(studentTitle,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JScrollPane(studentsList),c);

        c.gridx = 0; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(addStudentBtn, c);

        c.gridx = 1; // aligned with button 2
        c.gridy = 2; // third row
        pane.add(removeStudentBtn, c);
    }
    public void buildCoursesLayout(Container pane) {

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
 
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(enrolledCoursesTitle,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JScrollPane(enrolledCoursesList),c);

        c.gridx = 0; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(removeEnrolledCourseBtn, c);
    }
    public void buildCatalogLayout(Container pane) {

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(catalogTitle,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JScrollPane(catalogList),c);

        c.gridx = 0; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(searchBtn, c);

        c.gridx = 1; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(searchField,c);
    }
    
    public void buildSectionLayout(Container pane) {

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
 
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(sectionTitle,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JScrollPane(sectionList),c);

        c.gridx = 0; // aligned with button 2
        c.gridwidth = 1;
        c.gridy = 2; // third row
        pane.add(addCourseBtn, c);
    }

    
    public void addActionListenerCourse(ActionListener removeCourseListener){
        removeEnrolledCourseBtn.addActionListener(removeCourseListener);
    }
    public void addActionListenerStudent(ActionListener addStudentListener, ActionListener removeStudentListener,ListSelectionListener studentSelectListener){
        addStudentBtn.addActionListener(addStudentListener);
        removeStudentBtn.addActionListener(removeStudentListener);
        studentsList.addListSelectionListener(studentSelectListener);
    }

    public GUI() {
        // Create and set up the window.
       // JFrame frame = new JFrame("Student Registration");
        super("Student Registration");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the content pane.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        buildStudentLayout(panel1);
        buildCoursesLayout(panel2);
        buildCatalogLayout(panel3);
        buildSectionLayout(panel4);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        // Display the window.
        pack();
        setVisible(true) ;
        // this.addActionListener(this);
    }

}
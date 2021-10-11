package Views;
import Models.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
//1 student panel
    private JLabel studentTitle = new JLabel("Student");
    private JList<Student> studentsList = new JList<Student>();
    private JButton addStudentBtn = new JButton("+");
    private JButton removeStudentBtn = new JButton("-");
//2 enrolled courses panel
    private JLabel enrolledCoursesTitle = new JLabel("Enrolled Courses");
    private JList<Course> enrolledCoursesList= new JList<Course>();
    private JButton removeEnrolledCourseBtn= new JButton("Remove Course");
//3 Catalog panel
    private JLabel catalogTitle= new JLabel("Catalog");
    private JList<Course> catalogList= new JList<Course>();
    private JButton searchBtn= new JButton("Search");
    private JTextField searchField= new JTextField("enter course name");
//4 Section panel 
    private JLabel sectionTitle= new JLabel("Offering");
    private JList<Offering> sectionList= new JList<Offering>();
    private JButton addCourseBtn= new JButton("Add course");
    private JButton quitBtn = new JButton("QUIT!");
/**
 * create panes for each student, enroleld courseds, catalog and offerign sections
 * @param pane
 */
    public void buildStudentLayout(Container pane) {

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
 
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
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
        c.gridx = 0;
        pane.add(addCourseBtn, c);
        c.gridx = 1;
        //QUIT button. includes action listener
        pane.add(quitBtn,c);
        quitBtn.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                System.exit(0) ;
            }
        });
    }
    //actionListeners for 1 Student panel
    public void addActionListenerStudent(ActionListener addStudentListener, ActionListener removeStudentListener,ListSelectionListener studentSelectListener){
        addStudentBtn.addActionListener(addStudentListener);
        removeStudentBtn.addActionListener(removeStudentListener);
        studentsList.addListSelectionListener(studentSelectListener);
    }
    //actionListeners for 2 erolled Courses panel
    public void addActionListenerCourse(ActionListener removeCourseListener, ListSelectionListener enrollSelectListener){
        removeEnrolledCourseBtn.addActionListener(removeCourseListener);
        enrolledCoursesList.addListSelectionListener(enrollSelectListener);
    }
    //actionLIsteners for 3 Course catalog panel
    public void addActionListenerCatalog(ActionListener search, ListSelectionListener catalogSelectListener){
        searchBtn.addActionListener(search);
        catalogList.addListSelectionListener(catalogSelectListener);
    }
    //actionListeners for Offering panel
    public void addActionListenerOffering(ActionListener addCourseListener, ListSelectionListener OfferingSelectListener){
        addCourseBtn.addActionListener(addCourseListener);
        sectionList.addListSelectionListener(OfferingSelectListener);
    }
    public GUI() {
        // Create and set up the window.
       // JFrame frame = new JFrame("Student Registration");
       // super("Student Registration");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the content pane.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        //set up box layout
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

    //getters and setters
    public JLabel getStudentTitle() {
        return this.studentTitle;
    }

    public void setStudentTitle(JLabel studentTitle) {
        this.studentTitle = studentTitle;
    }

    public JList<Student> getStudentsList() {
        return this.studentsList;
    }

    public void setStudentsList(JList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public JButton getAddStudentBtn() {
        return this.addStudentBtn;
    }

    public void setAddStudentBtn(JButton addStudentBtn) {
        this.addStudentBtn = addStudentBtn;
    }

    public JButton getRemoveStudentBtn() {
        return this.removeStudentBtn;
    }

    public void setRemoveStudentBtn(JButton removeStudentBtn) {
        this.removeStudentBtn = removeStudentBtn;
    }

    public JLabel getEnrolledCoursesTitle() {
        return this.enrolledCoursesTitle;
    }

    public void setEnrolledCoursesTitle(JLabel enrolledCoursesTitle) {
        this.enrolledCoursesTitle = enrolledCoursesTitle;
    }

    public JList<Course> getEnrolledCoursesList() {
        return this.enrolledCoursesList;
    }

    public void setEnrolledCoursesList(JList<Course> enrolledCoursesList) {
        this.enrolledCoursesList = enrolledCoursesList;
    }

    public JButton getRemoveEnrolledCourseBtn() {
        return this.removeEnrolledCourseBtn;
    }

    public void setRemoveEnrolledCourseBtn(JButton removeEnrolledCourseBtn) {
        this.removeEnrolledCourseBtn = removeEnrolledCourseBtn;
    }

    public JLabel getCatalogTitle() {
        return this.catalogTitle;
    }

    public void setCatalogTitle(JLabel catalogTitle) {
        this.catalogTitle = catalogTitle;
    }

    public JList<Course> getCatalogList() {
        return this.catalogList;
    }

    public void setCatalogList(JList<Course> catalogList) {
        this.catalogList = catalogList;
    }

    public JButton getSearchBtn() {
        return this.searchBtn;
    }

    public void setSearchBtn(JButton searchBtn) {
        this.searchBtn = searchBtn;
    }

    public JTextField getSearchField() {
        return this.searchField;
    }

    public void setSearchField(JTextField searchField) {
        this.searchField = searchField;
    }

    public JLabel getSectionTitle() {
        return this.sectionTitle;
    }

    public void setSectionTitle(JLabel sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public JList<Offering> getSectionList() {
        return this.sectionList;
    }

    public void setSectionList(JList<Offering> sectionList) {
        this.sectionList = sectionList;
    }

    public JButton getAddCourseBtn() {
        return this.addCourseBtn;
    }

    public void setAddCourseBtn(JButton addCourseBtn) {
        this.addCourseBtn = addCourseBtn;
    }

    public JButton getQuitBtn() {
        return this.quitBtn;
    }

    public void setQuitBtn(JButton quitBtn) {
        this.quitBtn = quitBtn;
    }
}
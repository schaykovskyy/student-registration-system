package Controllers;
import Views.*;
import Models.*;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CStudent {
    private GUI view;
    private MStudent studentModel;
    private CRegistration registrationController;

    public CStudent(GUI view, MStudent studentModel, CRegistration registrationController){
        this.view=view; 
        this.studentModel= studentModel;
        this.registrationController = registrationController;

        view.getStudentsList().setModel(studentModel.getDefModel());
        view.addActionListenerStudent(new studentListener(), new studentListener(),new studentListener());
    }
    /**
     * add offering to student  enrolled courses
     * @param offering
     */
    public void addOffering(Offering offering){
        Student student = this.studentModel.getDefModel().get(this.view.getStudentsList().getSelectedIndex());
        Registration reg = new Registration();

        //check if student already registered in the selected offering
        boolean courseExists= false;
        if(!student.getRegList().isEmpty()){
            for (int i = 0; i < student.getRegList().size();i++){
                if(student.getRegList().get(i).getTheOffering()==offering){
                    System.out.println("Course already been added");
                    courseExists = true;
                    break;
                }
            }
        }
        //if student is not registered in the offering yet, add it
        if(!courseExists){

            reg.register(student, offering);
            registrationController.displayStudentCourses(studentModel.getDefModel().getElementAt(view.getStudentsList().getSelectedIndex()));
            System.out.println("Course Added");
        }
        
    }
    /**
     * Remove selected course from student enrolled courses
     * @param course
     */
    public void removeCourse(Course course){
        int index = view.getStudentsList().getSelectedIndex();// index of clicked
        Student s = studentModel.getDefModel().get(index);
        for(int i =0; i< s.getRegList().size();i++){
            Registration r = s.getRegList().get(i);
            Offering o = r.getTheOffering();
            if(o.getTheCourse()==course){
                s.getRegList().remove(i);
            }
        }
    }
    /**
     * action listner class, contians listeners for - + buttons and default list panel
     * 
     *  */ 
    class studentListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.getAddStudentBtn()) {
                System.out.println("addStudent");
            }
            if(e.getSource()== view.getRemoveStudentBtn()) {
                System.out.println("removeStudent");
            }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                //get index of selected student
                int studentIndex= view.getStudentsList().getSelectedIndex();
                //get selected student
                Student selectedStudent=studentModel.getDefModel().getElementAt(studentIndex);
                //display courese of selected student
                registrationController.displayStudentCourses(selectedStudent);
            }
        }
    } 
}

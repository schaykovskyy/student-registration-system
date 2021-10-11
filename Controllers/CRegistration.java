package Controllers;
import Views.*;
import Models.*;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRegistration {
    private GUI view;
    private MRegistration registrationModel;
    public CStudent studentController;
    public CRegistration(GUI view, MRegistration registrationModel){
        this.view=view; 
        this.registrationModel= registrationModel;

        view.getEnrolledCoursesList().setModel(registrationModel.getDefModel());
        view.addActionListenerCourse(new courseListener(), new courseListener());
    }
    /**
     * Displays student courses to student enrolled courses panel in gui.
     * 
     */
    public void displayStudentCourses(Student student){
        registrationModel.getDefModel().clear();    //crear registration panel before new elemets are added
        for(int i = 0; i < student.getRegList().size(); i++){
            Course c = student.getRegList().get(i).getTheOffering().getTheCourse();
            registrationModel.getDefModel().addElement(c);
        }

    }
  
    class courseListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.getRemoveEnrolledCourseBtn()) {
                // get enrolled course index
                int enrolledCourseIndex= view.getEnrolledCoursesList().getSelectedIndex();
                //get enroleld course
                Course enrolledCourse = registrationModel.getDefModel().get(enrolledCourseIndex);
                //remove course from student and registration
                studentController.removeCourse(enrolledCourse);
                registrationModel.getDefModel().remove(enrolledCourseIndex);
                System.out.println("Course Removed");
            }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                //returns index of selected list object
                // System.out.println(view.studentsList.getSelectedIndex());
            }
        }
    } 
}

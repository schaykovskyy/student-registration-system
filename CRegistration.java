import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CRegistration {
    private GUI view;
    private MRegistration model;
    public CStudent studentController;
    public CRegistration(GUI view, MRegistration registrationModel){
        this.view=view; 
        this.model= registrationModel;
        // this.studentController= studentController;
        view.enrolledCoursesList.setModel(model.defModel);

        view.addActionListenerCourse(new courseListener(), new courseListener());
    }
    public void displayStudentCourses(Student student){
        model.defModel.clear();
        for(int i = 0; i < student.getRegList().size(); i++){
            // student.getRegList().get(i).getTheOffering().getTheCourse();
            Course c = student.getRegList().get(i).getTheOffering().getTheCourse();
            model.defModel.addElement(c);
        }

    }
    // public void removeStudent(Student s){
    //     Offering ofr = new Offering()
    // }
    public void addOffering(Offering offering){
        model.defModel.addElement(offering.getTheCourse()); 
    }
    class courseListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.removeEnrolledCourseBtn) {
                System.out.println("Remove Course");
                int index = view.enrolledCoursesList.getSelectedIndex();
                Course c = model.defModel.get(index);
                studentController.removeCourse(c);
                model.defModel.remove(index);

            }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                //returns index of selected list object
                System.out.println(view.studentsList.getSelectedIndex());
            }
        }
    } 
}

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CRegistration {
    private GUI view;
    private MRegistration model;

    public CRegistration(GUI view, MRegistration registrationModel){
        this.view=view; 
        this.model= registrationModel;
        view.enrolledCoursesList.setModel(model.defModel);

        view.addActionListenerCourse(new courseListener());
    }
    class courseListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.removeEnrolledCourseBtn) {
                System.out.println("Remove Course");
                model.defModel.remove(view.studentsList.getSelectedIndex());
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

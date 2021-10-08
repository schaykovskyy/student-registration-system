import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CStudent {
    private GUI view;
    private MStudent model;
    private CRegistration registrationController;
    public CStudent(GUI view, MStudent studentmodel, CRegistration registrationController){
        this.view=view; 
        this.model= studentmodel;
        this.registrationController = registrationController;
        view.studentsList.setModel(model.defModel);

        view.addActionListenerStudent(new studentListener(), new studentListener(),new studentListener());
    }
    public void addOffering(Offering offering){
        Student s = this.model.defModel.get(this.view.studentsList.getSelectedIndex());
        Registration reg = new Registration();
        reg.register(s, offering);
        registrationController.displayStudentCourses(model.defModel.getElementAt(view.studentsList.getSelectedIndex()));
    }
    // public void removeOffering(Offering offering){
    //     Student s = this.model.defModel.get(this.view.studentsList.getSelectedIndex());
    //     Registration reg = new Registration();
    //     reg.deregister(s, offering); 

    // }
    public void removeCourse(Course course){
        int index = view.studentsList.getSelectedIndex();
        Student s = model.defModel.get(index);
        Registration reg = new Registration();
        // reg.deregister(s, );
        for(int i =0; i< s.getRegList().size();i++){
            
            Registration r = s.getRegList().get(i);
            Offering o = r.getTheOffering();
            if(o.getTheCourse()==course){
                System.out.println("000000000");
                s.getRegList().remove(i);
            }
        }
    }
    class studentListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.addStudentBtn) {
                System.out.println("addStudent");
            }
            if(e.getSource()== view.removeStudentBtn) {
                System.out.println("removeStudent");
                model.defModel.remove(view.studentsList.getSelectedIndex());
            }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                //returns index of selected list object
                System.out.println(view.studentsList.getSelectedIndex());
                // model.currentlySelected = view.studentsList.getSelectedIndex();
                // model.updateSelected();
                registrationController.displayStudentCourses(model.defModel.getElementAt(view.studentsList.getSelectedIndex()));
            }
        }
    } 
}

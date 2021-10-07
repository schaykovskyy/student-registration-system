import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CStudent {
    private GUI view;
    private MStudent model;

    public CStudent(GUI view, MStudent studentmodel){
        this.view=view; 
        this.model= studentmodel;
        view.studentsList.setModel(model.defModel);

        view.addActionListenerStudent(new studentListener(), new studentListener(),new studentListener());
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
                model.updateSelected();
            }
        }
    } 
}

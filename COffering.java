import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class COffering{
    private GUI view;
    private MOffering model;
    private CStudent studentController;
    public COffering(GUI view, MOffering offeringModel, CStudent studentController){
        this.view=view; 
        this.model= offeringModel;
        this.studentController= studentController;
        view.sectionList.setModel(model.defModel);

        view.addActionListenerOffering(new offeringListener(),new offeringListener());
    }
    public void updateOfferings (Course course){
        ArrayList <Offering> offeringList = course.getOfferingList();
        model.defModel.clear(); 
        // defModel.add(0,new Offering(course, 2, 20)) ;
        for(int i =0; i< offeringList.size(); i++) {
            // defModel.add(i, offeringList.get(i));
            model.defModel.addElement(offeringList.get(i));
        }
    }
    class offeringListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.addCourseBtn) {
                System.out.println("Add Course");
                studentController.addOffering(model.defModel.getElementAt(view.sectionList.getSelectedIndex()));
            }
            // if(e.getSource()== view.removeStudentBtn) {
            //     System.out.println("removeStudent");
            //     model.defModel.remove(view.studentsList.getSelectedIndex());
            // }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                //returns index of selected list object
                System.out.println(view.sectionList.getSelectedIndex());
                // model.currentlySelected = view.studentsList.getSelectedIndex();
                // model.updateSections(model.defModel.get(view.catalogList.getSelectedIndex()));
                // model.defModel.get(view.catalogList.getSelectedIndex());
            }
        }
    } 
}

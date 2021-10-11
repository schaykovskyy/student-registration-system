package Controllers;
import Views.*;
import Models.*;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class COffering{
    private GUI view;
    private MOffering offeringModel;
    private CStudent studentController;
    public COffering(GUI view, MOffering offeringModel, CStudent studentController){
        this.view=view; 
        this.offeringModel= offeringModel;
        this.studentController= studentController;
        view.getSectionList().setModel(offeringModel.getDefModel());

        view.addActionListenerOffering(new offeringListener(),new offeringListener());
    }
    /**
     * upadtes offering view pane with offerings of selescted courses
     * @param course
     */
    public void updateOfferings (Course course){
        ArrayList <Offering> offeringList = course.getOfferingList();
        offeringModel.getDefModel().clear(); 

        for(int i =0; i< offeringList.size(); i++) {
            offeringModel.getDefModel().addElement(offeringList.get(i));
        }
    }
    class offeringListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.getAddCourseBtn()) {
                // studentController.addOffering(offeringModel.getDefModel().getElementAt(view.getSectionList().getSelectedIndex()));
                //get selected offering index
                int selectedOfferingIndex =view.getSectionList().getSelectedIndex();
                //get selected offering
                Offering selectedOffering = offeringModel.getDefModel().getElementAt(selectedOfferingIndex);
                //add offering to student
                studentController.addOffering(selectedOffering);
            }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                //returns index of selected list object
                // System.out.println(view.sectionList.getSelectedIndex());
            }
        }
    } 
}

package Controllers;
import Views.*;
import Models.*;

import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CCatalog{
    private GUI view;
    private MCatalog catalogModel;
    private COffering offeringController;

    public CCatalog(GUI view, MCatalog catalogModel, COffering offeringController){
        this.view=view; 
        this.catalogModel= catalogModel;
        this.offeringController = offeringController;

        view.getCatalogList().setModel(catalogModel.getDefModel());
        view.addActionListenerCatalog(new studentListener(),new studentListener());
    }
    /**
     * search catalog for specific courses.
     * serach is based on name of the course only. no numbers 
     * @param courseName
     * @return returns defaultListModel of found courses
     */
    public DefaultListModel<Course> searchCat(String courseName){
        DefaultListModel<Course> foundCoursesDefModel = new DefaultListModel<Course>();
        
        if (courseName.isEmpty()){
            view.getSearchField().setText("enter course name");
            return catalogModel.getDefModel();
        }
        // System.out.println(catalogModel.getDefModel().size());
        for (int i = 0; i < catalogModel.getDefModel().size(); i++){
            Course c = catalogModel.getDefModel().get(i);
            if(c.getCourseName().equals(courseName)){
                foundCoursesDefModel.addElement(c);
            }
        }
        return foundCoursesDefModel;
    }

    class studentListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.getSearchBtn()) {
                System.out.println("Search for "+view.getSearchField().getText());
                String query = view.getSearchField().getText();
                // searchCat(query);
                view.getCatalogList().setModel(searchCat(query));
            }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                //returns index of selected course in a catalog 
                // System.out.println(view.catalogList.getSelectedIndex());
                int catalogIndex = view.getCatalogList().getAnchorSelectionIndex();
                //get course 
                Course selectedCourse = view.getCatalogList().getModel().getElementAt(catalogIndex);
                //update offering with selected course info
                offeringController.updateOfferings(selectedCourse);
            }
        }
    } 
}

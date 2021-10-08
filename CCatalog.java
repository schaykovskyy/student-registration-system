import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CCatalog{
    private GUI view;
    private MCatalog model;
    private COffering offeringController;

    public CCatalog(GUI view, MCatalog catalogModel, COffering offeringController){
        this.view=view; 
        this.model= catalogModel;
        this.offeringController = offeringController;
        view.catalogList.setModel(model.defModel);

        view.addActionListenerCatalog(new studentListener(),new studentListener());
    }
    public DefaultListModel<Course> searchCat(String courseName){
        DefaultListModel<Course> foundCoursesDefModel = new DefaultListModel<Course>();
        
        if (courseName.isEmpty()){
            view.searchField.setText("enter course name");
            return model.defModel;
        }
        System.out.println(model.defModel.size());
        for (int i = 0; i < model.defModel.size(); i++){
            Course c = model.defModel.get(i);
            if(c.getCourseName().equals(courseName)){
                // System.out.println(c.getCourseName());
                foundCoursesDefModel.addElement(c);
            }
        }
        return foundCoursesDefModel;
    }

    class studentListener implements ActionListener, ListSelectionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== view.searchBtn) {
                System.out.println("Search");
                String query = view.searchField.getText();
                // searchCat(query);
                view.catalogList.setModel(searchCat(query));
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
                System.out.println(view.catalogList.getSelectedIndex());
                // model.updateSections(model.defModel.get(view.catalogList.getSelectedIndex()));

                // model.updateSections(view.catalogList.getModel().getElementAt(view.catalogList.getSelectedIndex()));
                // model.updateSections(view.catalogList.getModel().getElementAt(view.catalogList.getSelectedIndex()));
                offeringController.updateOfferings(view.catalogList.getModel().getElementAt(view.catalogList.getSelectedIndex()));
            }
        }
    } 
}

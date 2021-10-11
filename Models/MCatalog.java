package Models;

import javax.swing.DefaultListModel;
/**
 * class containing list of courses in a format of DefaultListModel
 * that is used to display list of courses in Catalog pane
 */
public class MCatalog{
    private DefaultListModel<Course> defModel = new DefaultListModel<Course>();

    public MCatalog(){

        //hardcoded catalog courses. 
        //add courses
        defModel.add(0, new Course ("ENGG",233));
        defModel.add(1, new Course ("PHYS",259));
        defModel.add(2, new Course ("ENSF",607));
        defModel.add(3, new Course ("ENSF",608));
        defModel.add(4, new Course ("ENSF",612));
        defModel.add(5, new Course ("ENSF",611));
        defModel.add(6, new Course ("COMS",365));
        defModel.add(7, new Course ("ENSF",593));
        defModel.add(8, new Course ("ENSF",592));
        defModel.add(9, new Course ("ENGG",202));
        defModel.add(10, new Course ("ENGG",265));
        
        //add offerings to each course
        defModel.get(0).getOfferingList().add(new Offering(defModel.get(0),1,75));
        defModel.get(0).getOfferingList().add(new Offering(defModel.get(0),2,87));
        defModel.get(1).getOfferingList().add(new Offering(defModel.get(1),1,80));
        defModel.get(1).getOfferingList().add(new Offering(defModel.get(1),2,90));
        defModel.get(2).getOfferingList().add(new Offering(defModel.get(2),1,30));
        defModel.get(2).getOfferingList().add(new Offering(defModel.get(2),2,30));
        defModel.get(3).getOfferingList().add(new Offering(defModel.get(3),1,50));
        defModel.get(4).getOfferingList().add(new Offering(defModel.get(4),1,70));
        defModel.get(5).getOfferingList().add(new Offering(defModel.get(5),1,60));
        defModel.get(6).getOfferingList().add(new Offering(defModel.get(6),1,100));
        defModel.get(7).getOfferingList().add(new Offering(defModel.get(7),1,100));
        defModel.get(8).getOfferingList().add(new Offering(defModel.get(8),1,44));
        defModel.get(9).getOfferingList().add(new Offering(defModel.get(9),1,60));
        defModel.get(10).getOfferingList().add(new Offering(defModel.get(10),1,90));
    }
    

    public DefaultListModel<Course> getDefModel() {
        return this.defModel;
    }
    public void setDefModel(DefaultListModel<Course> defModel) {
        this.defModel = defModel;
    }
}

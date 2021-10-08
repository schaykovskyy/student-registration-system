import javax.swing.DefaultListModel;

public class MCatalog{
    public DefaultListModel<Course> defModel = new DefaultListModel<Course>();
    public Course currentlySelectedCourse; 
    public MOffering offeringModel;

    public MCatalog(MOffering offeringModel){
        this.offeringModel = offeringModel;
        //add courses
        defModel.add(0, new Course ("ENGG",233));
        defModel.add(1, new Course ("PHYS",259));
        defModel.add(2, new Course ("ENSF",607));
        defModel.add(3, new Course ("ENSF",608));
        defModel.add(4, new Course ("ENSF",612));
        defModel.add(5, new Course ("ENSF",611));
        defModel.add(6, new Course ("COMS",365));
        
        //manually add offerings to each course
        defModel.get(0).getOfferingList().add(new Offering(defModel.get(0),1,140));
        defModel.get(0).getOfferingList().add(new Offering(defModel.get(0),2,130));
        defModel.get(1).getOfferingList().add(new Offering(defModel.get(1),1,80));
        defModel.get(1).getOfferingList().add(new Offering(defModel.get(1),2,90));
        defModel.get(2).getOfferingList().add(new Offering(defModel.get(2),1,30));
        defModel.get(2).getOfferingList().add(new Offering(defModel.get(2),2,30));
        defModel.get(3).getOfferingList().add(new Offering(defModel.get(3),1,60));
        defModel.get(4).getOfferingList().add(new Offering(defModel.get(4),1,60));
        defModel.get(5).getOfferingList().add(new Offering(defModel.get(5),1,60));
        defModel.get(6).getOfferingList().add(new Offering(defModel.get(6),1,200));
    }
    // public void updateSections(Course course){
    //      offeringModel.updateOfferings(course);
    // }
}

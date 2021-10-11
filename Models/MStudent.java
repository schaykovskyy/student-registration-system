package Models;
import javax.swing.DefaultListModel;

/**
 * Class that contains students in DefaultListModel 
 * used to display names and Ids in Student pane
 */
public class MStudent {
    private DefaultListModel<Student> defModel = new DefaultListModel<Student>();

    public MStudent(){
        //hardcoded student names and few registrations
        Student s1 = new Student("Sam",1001235);
        Student s2= new Student("John",2123492);
        
        defModel.addElement(s1);
        defModel.addElement(s2);

    }
    //getters and setters
    public DefaultListModel<Student> getDefModel() {
        return this.defModel;
    }
    public void setDefModel(DefaultListModel<Student> defModel) {
        this.defModel = defModel;
    }
}

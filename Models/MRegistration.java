package Models;
import javax.swing.DefaultListModel;
/**
 * Class that contains list of Courses in DefaultListModel
 * used to display courses that student is currently registered 
 */
public class MRegistration {
    private DefaultListModel<Course> defModel = new DefaultListModel<Course>();

    public MRegistration(){
    }

    //getters and setters
    public DefaultListModel<Course> getDefModel() {
        return this.defModel;
    }
    public void setDefModel(DefaultListModel<Course> defModel) {
        this.defModel = defModel;
    }

}

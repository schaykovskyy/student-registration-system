package Models;
import javax.swing.DefaultListModel;

/**
 * Class that contains list of Offering in DefaultListModel
 * used for disopalying course offerings in Offerings pane
 */
public class MOffering{
    private DefaultListModel<Offering> defModel = new DefaultListModel<Offering>();

    public MOffering(){
    }
   
    //getters and setters
    public DefaultListModel<Offering> getDefModel() {
        return this.defModel;
    }
    public void setDefModel(DefaultListModel<Offering> defModel) {
        this.defModel = defModel;
    }
}

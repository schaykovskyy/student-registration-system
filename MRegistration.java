import javax.swing.DefaultListModel;

public class MRegistration {
    public DefaultListModel<Course> defModel = new DefaultListModel<Course>();
    public MRegistration(){
        // public int currentlySelected; 
        defModel.add(0, new Course("ENSF",474));
        defModel.add(1, new Course("ENSF",424));
        defModel.add(2, new Course("Engg",424));
        
    }
    public void temp(){
        defModel.add(2, new Course("test",424));
    }
}

import javax.swing.DefaultListModel;

public class MStudent {
    public DefaultListModel<Student> defModel = new DefaultListModel<Student>();
    public int currentlySelected; 
    public MRegistration regModel;
    public MStudent(MRegistration regModel){
        this.regModel = regModel;
        defModel.add(0, new Student("serhiy",200));
        defModel.add(1, new Student("seriy",20));
        defModel.add(2, new Student("sery",10)); 
        defModel.add(3, new Student("safi",10)); 
        defModel.add(4, new Student("aklas",10)); 

    }
    public void updateSelected(){
        regModel.temp();
    }
}

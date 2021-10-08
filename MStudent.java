import javax.swing.DefaultListModel;

public class MStudent {
    public DefaultListModel<Student> defModel = new DefaultListModel<Student>();
    public int currentlySelected; 
    public MRegistration regModel;
    public MStudent(MRegistration regModel){
        this.regModel = regModel;

        Registration rgst = new Registration(); 

        Student s1 = new Student("safi",10);
        Course c = new Course("ENGG",1);
        Offering ofr = new Offering(c, 1, 55);
        rgst.register(s1,ofr);

        Course c2 = new Course("ENSF",500);
        Offering ofr2 = new Offering(c2,2, 40);
        rgst.register(s1, ofr2);

        defModel.addElement(s1);;

        Student s2= new Student("sam",22);
        rgst.register(s2, ofr);
        defModel.addElement(s2);
        // defModel.add(0, new Student("serhiy",200));
        // defModel.add(1, new Student("seriy",20));
        // defModel.add(2, new Student("sery",10)); 

    }
    // public void updateSelected(){
    //     regModel.temp();
    // }
}

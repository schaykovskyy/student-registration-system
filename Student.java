import java.util.ArrayList;

public class Student{
    private String studentName;
    private int studentID;
    private ArrayList <Registration> regList;

    public Student(String studentName, int studentID){
        this.setStudentName(studentName);
        this.setStudentID(studentID);
        setRegList(new ArrayList <Registration>());
    }

    public void registerForCourse(CourseCat cat, String courseName, int courseNumber, int secNumber){
        Course myCourse = cat.searchCat(courseName, courseNumber);
        if (myCourse == null){
            return;
        }
        Offering theOffering = myCourse.getOfferingList().get(secNumber -1);
        Registration reg = new Registration();
        //if student already registered
        for(Registration r: regList){
            if(r.getTheOffering().getTheCourse()==theOffering.getTheCourse()){
                System.out.println("Student already regeistered in this course");
                return;
            }
        }
        reg.register(this, theOffering);
    }
    public void deregisterCourse(CourseCat cat, String courseName, int courseNumber,int secNumber){
        Course courseToRemove = cat.searchCat(courseName, courseNumber);
        if(courseToRemove == null){
            return;
        }
        Offering offeringToRemove = courseToRemove.getOfferingList().get(secNumber-1);
        Registration registrationToRemove = new Registration();
        for (Registration r: regList){
            if(r.getTheOffering()==offeringToRemove){
                registrationToRemove = r;
            }
        }
        regList.get(regList.indexOf(registrationToRemove)).deregister(this, offeringToRemove);
    }

    public void addRegistration(Registration reg){
        regList.add(reg);
    }
    public void removeRegistration(Registration reg){
        regList.remove(reg);
    }

    //getters and setters

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public ArrayList<Registration> getRegList() {
        return this.regList;
    }

    public void setRegList(ArrayList<Registration> regList) {
        this.regList = regList;
    }

    @Override
    public String toString(){
        return studentName +" "+ studentID;
    }

}

import java.util.ArrayList;
public class Course{
    private String courseName;
    private int courseNumber;
    private ArrayList <Course> preReq;
    private ArrayList <Offering> offeringList;

    public Course(String courseName, int courseNumber){
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        preReq = new ArrayList <Course>();
        offeringList = new ArrayList<Offering>();
    }

    public void addOffering(Offering theOffering){
        offeringList.add(theOffering);
    }

    public void removeOffering(Offering theOffering){
        offeringList.remove(theOffering);
    }

    //toString funciton to print both name and number
    @Override
    public String toString(){
        return courseName + " " + courseNumber;
    }

    //getters and setters
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public int getCourseNumber(){
        return courseNumber;
    }
    public void setCourseNumber(int courseNumber){
        this.courseNumber = courseNumber;
    }
    public ArrayList<Course> getPreReq() {
        return this.preReq;
    }
    public void setPreReq(ArrayList<Course> preReq) {
        this.preReq = preReq;
    }
    public ArrayList<Offering> getOfferingList() {
        return this.offeringList;
    }
    public void addToOfferingList(Offering offeringList){
        this.offeringList.add(offeringList);
    }
    public void setOfferingList(ArrayList<Offering> offeringList) {
        this.offeringList = offeringList;
    }
}
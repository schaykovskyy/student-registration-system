package Models;

import java.util.ArrayList;
public class Offering {
    private int sectionNum;
    private int sectionCap;// capacity 
    private Course theCourse;
    private ArrayList <Registration> studentList;
    
    public Offering(Course theCourse, int sectionNum, int sectionCap){
        setSectionNum(sectionNum);
        setSectionCap(sectionCap);
        setTheCourse(theCourse);
        studentList = new ArrayList <Registration>();
    }

    public void addRegistration(Registration reg){
        studentList.add(reg);
    }

    //getters and setters
    public int getSectionNum() {
        return this.sectionNum;
    }
    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }
    public int getSectionCap() {
        return this.sectionCap;
    }
    public void setSectionCap(int sectionCap) {
        this.sectionCap = sectionCap;
    }
    public Course getTheCourse(){
        return theCourse;
    }
    public void setTheCourse(Course theCourse){
        this.theCourse = theCourse;
    }
    public ArrayList <Registration> getStudentList(){
        return studentList;
    }
    public void setStudentList(ArrayList <Registration> studentList){
        this.studentList = studentList;
    }
    @Override
    public String toString(){
        return "Section Number: "+sectionNum + " Section Capacity: "+ sectionCap;
    }

}

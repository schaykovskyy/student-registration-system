import java.util.ArrayList;
public class CourseCat {
    private ArrayList<Course> courseList;

    public CourseCat(){
        courseList = loadFromDB();
    }

    public void listCourse(){
        for(Course c: courseList){
            System.out.println(c);
        }
    }

    public ArrayList <Course> searchCat(String courseName){
        ArrayList <Course> foundCourses= new ArrayList <Course>();
        for (Course c: courseList){
            if(c.getCourseName().equals(courseName)){
                foundCourses.add(c);
            }
        }
        if(foundCourses.isEmpty()){
            System.out.println("No courses found with that name");
            return null;
        }
        //search for courses thattheir name matches coursName adna dd to the foundCourses array
        return foundCourses;
    }

    public Course searchCat (String courseName, int courseNumber){
        for (Course c: courseList){
            if (c.getCourseNumber()==courseNumber && c.getCourseName().equals(courseName)){
                return c;
            }
        }
        System.err.println("Course "+courseName+" "+courseNumber+" does NOT exist!");
        return null;
    }

    public void createOffering(Course theCourse, int secNum, int secCap){
        if(theCourse != null){
            Offering theOffering = new Offering(theCourse, secNum, secCap);
            theOffering.setTheCourse(theCourse);
            theCourse.addOffering(theOffering);
            theOffering.setTheCourse(theCourse);
        }
    }

    private static ArrayList<Course> loadFromDB(){
        //in real life couses will be loaded from the DB or at least from some file on disk. 
        //So for now, just imagine!! this is all t coming from a db
        ArrayList<Course> imaginaryDB = new ArrayList <Course>();

        //add courses
        imaginaryDB.add(new Course ("ENGG",233));
        imaginaryDB.add(new Course ("PHYS",259));
        imaginaryDB.add(new Course ("ENSF",607));
        imaginaryDB.add(new Course ("ENSF",608));
        imaginaryDB.add(new Course ("ENSF",612));
        imaginaryDB.add(new Course ("ENSF",611));
        imaginaryDB.add(new Course ("COMS",365));
        
        //manually add offerings to each course
        imaginaryDB.get(0).getOfferingList().add(new Offering(imaginaryDB.get(0),1,140));
        imaginaryDB.get(0).getOfferingList().add(new Offering(imaginaryDB.get(0),2,130));
        imaginaryDB.get(1).getOfferingList().add(new Offering(imaginaryDB.get(1),1,80));
        imaginaryDB.get(1).getOfferingList().add(new Offering(imaginaryDB.get(1),2,90));
        imaginaryDB.get(2).getOfferingList().add(new Offering(imaginaryDB.get(2),1,30));
        imaginaryDB.get(2).getOfferingList().add(new Offering(imaginaryDB.get(2),2,30));
        imaginaryDB.get(3).getOfferingList().add(new Offering(imaginaryDB.get(3),1,60));
        imaginaryDB.get(4).getOfferingList().add(new Offering(imaginaryDB.get(4),1,60));
        imaginaryDB.get(5).getOfferingList().add(new Offering(imaginaryDB.get(5),1,60));
        imaginaryDB.get(6).getOfferingList().add(new Offering(imaginaryDB.get(6),1,200));

        return imaginaryDB;
    }

    //getters and setters
    public ArrayList<Course> getCourseList() {
        return this.courseList;
    }
    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString(){
        String temp = "";
        for (Course c: courseList){
            temp += c;
            temp +="\n";
        }
        return temp;
    }
}


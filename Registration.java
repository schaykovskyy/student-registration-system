public class Registration {
    private Student theStudent;
    private Offering theOffering;
    private char grade;

    public void register(Student theStudent, Offering theOffering){
        setTheStudent(theStudent);
        setTheOffering(theOffering);
        addRegistration();
    }
    private void addRegistration(){
        if(theStudent.getRegList().size() >= 6){
            System.out.println("Student cannot enroll in more than 6 courses");
        }
        else if(theOffering.getStudentList().size() >= theOffering.getSectionCap()){
            System.out.println("Unable to register. Section is full");
        }
        else if(theOffering.getStudentList().size() < 8){
            theStudent.addRegistration(this);
            theOffering.addRegistration(this);
            System.out.println("Successfully Enrolled.");
            System.out.println("Warning! Need at least 8 enrollments for section to run.");
        }
        else{
            theStudent.addRegistration(this);
            theOffering.addRegistration(this);
            System.out.println("Successfully Enrolled.");
        }
    }
    public void deregister(Student theStudent, Offering theOffering){
        theOffering.removeRegistration(this);
        theStudent.removeRegistration(this);
        System.out.println("Course Dropped.");
    }

    //getters and setters
    public Student getTheStudent() {
        return this.theStudent;
    }
    public void setTheStudent(Student theStudent) {
        this.theStudent = theStudent;
    }
    public Offering getTheOffering() {
        return this.theOffering;
    }
    public void setTheOffering(Offering theOffering) {
        this.theOffering = theOffering;
    }
    public char getGrade() {
        return this.grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    @Override

    public String toString(){
        StringBuilder str = new StringBuilder("");
        str.append(theOffering.getTheCourse().getCourseName());
        str.append(" ");
        str.append(theOffering.getTheCourse().getCourseNumber());
        str.append(" Section: ");
        str.append(theOffering.getSectionNum());
        return str.toString();
    }
}

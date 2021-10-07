public class Driver {
    public static void main(String args[]){
        MRegistration registrationModel = new MRegistration();
        MStudent studentModel = new MStudent(registrationModel);
        GUI guiView = new GUI();
        CStudent studentController = new CStudent(guiView, studentModel);
        CRegistration registrationController = new CRegistration(guiView, registrationModel);
    }
}
